package esmj3dfo3.j3d.cell;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Texture;
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

import esmj3d.j3d.j3drecords.inst.J3dLAND;

public class Fo3LODLandscape extends BranchGroup
{

	public Fo3LODLandscape(int lodX, int lodY, int scale, String worldFormName, MeshSource meshSource, TextureSource textureSource)
	{
		String cellName = "wasteland"; //TODO: should be based on id

		//TODO: level32 and level16 and level 8 and level 4

		//TODO: there is a distantlod directory with lod files in it how do they work?
		String meshName = "landscape\\lod\\" + cellName + "\\" + cellName + ".level" + scale + ".x" + lodX + ".y" + lodY + ".nif";

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
					GeometryArray baseItsa = J3dNiTriShape.makeGeometry(gi, false);

					Shape3D shape = new Shape3D();
					shape.setGeometry(baseItsa);
					Appearance app = new Appearance();
					app.setMaterial(J3dLAND.getLandMaterial());
					BSShaderTextureSet ts = (BSShaderTextureSet) blocks.getNiObjects()[3];

					Texture tex = textureSource.getTexture(ts.textures[0]);
					app.setTexture(tex);

					shape.setAppearance(app);

					// TransformGroup tg = J3dNiAVObject.getTransformFromNiAVObject((NiTriStrips) blocks[0]);
					TransformGroup tg = new TransformGroup();
					BSMultiBoundNode root = (BSMultiBoundNode) blocks.root();
					Transform3D t = new Transform3D(ConvertFromNif.toJ3d(root.rotation), ConvertFromNif.toJ3d(root.translation), root.scale);
					tg.setTransform(t);
					tg.addChild(shape);
					addChild(tg);
				}

			}

		}
		else
		{
			//fine the systems just askign for empty space which is fine
			//System.out.println("Bad landscape name " + meshName + " lodX " + lodX + " lodY " + lodY);
		}

	}
}
