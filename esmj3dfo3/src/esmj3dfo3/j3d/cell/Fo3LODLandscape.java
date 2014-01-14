package esmj3dfo3.j3d.cell;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.IndexedGeometryArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import nif.NiObjectList;
import nif.NifFile;
import nif.NifToJ3d;
import nif.j3d.J3dNiTriShape;
import nif.niobject.NiTriShapeData;
import nif.niobject.bs.BSMultiBoundNode;
import nif.niobject.bs.BSShaderTextureSet;
import utils.convert.ConvertFromNif;
import utils.source.MeshSource;
import utils.source.TextureSource;

import com.sun.j3d.utils.geometry.GeometryInfo;

import esmj3d.j3d.cell.MorphingLandscape;

public class Fo3LODLandscape extends MorphingLandscape
{

	//TODO: use the J3DLand from cell to fill out, but dont' load the near cell nessasarily at all.
	// same for Skyrim
	public Fo3LODLandscape(int lodX, int lodY, int scale, String worldFormName, MeshSource meshSource, TextureSource textureSource)
	{
		super(lodX, lodY, scale);
		String meshName = "landscape\\lod\\" + worldFormName + "\\" + worldFormName + ".level" + scale + ".x" + lodX + ".y" + lodY + ".nif";

		setCapability(BranchGroup.ALLOW_DETACH);
		if (meshSource.nifFileExists(meshName))
		{
			NifFile nf = NifToJ3d.loadNiObjects(meshName, meshSource);
			if (nf != null)
			{
				NiObjectList blocks = nf.blocks;

				// we know it is a NiTriShapeData at block 4
				NiTriShapeData data = (NiTriShapeData) blocks.getNiObjects()[4];
				GeometryInfo gi = J3dNiTriShape.makeGeometryInfo(data);
				if (gi != null)
				{
					//scale 4 will get morph treatment later
					boolean compact = scale != 4;
					GeometryArray baseItsa = J3dNiTriShape.makeGeometry(gi, compact, data);

					Shape3D shape = new Shape3D();
					shape.setGeometry(baseItsa);

					BSShaderTextureSet ts = (BSShaderTextureSet) blocks.getNiObjects()[3];

					shape.setAppearance(createAppearance(textureSource.getTexture(ts.textures[0])));

					// TransformGroup tg = J3dNiAVObject.getTransformFromNiAVObject((NiTriStrips) blocks[0]);
					TransformGroup tg = new TransformGroup();
					BSMultiBoundNode root = (BSMultiBoundNode) blocks.root();
					Transform3D t = new Transform3D(ConvertFromNif.toJ3d(root.rotation), ConvertFromNif.toJ3d(root.translation), root.scale);
					tg.setTransform(t);
					tg.addChild(shape);
					addChild(tg);

					//scale 4 will get morph treatment later
					if (scale == 4)
					{
						baseItsa.setCapability(GeometryArray.ALLOW_REF_DATA_WRITE);
						this.setGeometryArray((IndexedGeometryArray) baseItsa);
					}
				}

			}
			else
			{
				System.out.println("Bad landscape GI " + meshName);
			}

		}
		else
		{
			//fine the systems just askign for empty space which is fine
			System.out.println("Bad landscape name " + meshName);
		}

	}

}
