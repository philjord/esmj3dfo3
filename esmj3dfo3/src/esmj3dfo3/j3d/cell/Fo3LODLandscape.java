package esmj3dfo3.j3d.cell;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Group;
import javax.media.j3d.IndexedGeometryArray;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import esmj3d.j3d.cell.MorphingLandscape;
import nif.NiObjectList;
import nif.NifFile;
import nif.NifJ3dVisRoot;
import nif.NifToJ3d;
import nif.basic.NifRef;
import nif.j3d.J3dNiTriShape;
import nif.niobject.NiAVObject;
import nif.niobject.NiProperty;
import nif.niobject.NiTriShape;
import nif.niobject.NiTriShapeData;
import nif.niobject.bs.BSMultiBoundNode;
import nif.niobject.bs.BSShaderPPLightingProperty;
import nif.niobject.bs.BSShaderTextureSet;
import utils.convert.ConvertFromNif;
import utils.source.MeshSource;
import utils.source.TextureSource;

public class Fo3LODLandscape extends MorphingLandscape
{
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
				BSMultiBoundNode root = (BSMultiBoundNode) blocks.root();

				TransformGroup tg = new TransformGroup();
				tg.clearCapabilities(); 
				Transform3D t = new Transform3D(ConvertFromNif.toJ3d(root.rotation), ConvertFromNif.toJ3d(root.translation), root.scale);
				tg.setTransform(t);

				for (NifRef cnr : root.children)
				{
					NiAVObject child = (NiAVObject) nf.blocks.get(cnr);

					/*if (child instanceof BSSegmentedTriShape)
					{
						// I believe these are water with no texture data
						System.out.println("seg");
					}
					else */

					if (child instanceof NiTriShape)
					{
						// regular lod terrains
						NiTriShape niTriShape = (NiTriShape) child;
						NiTriShapeData data = (NiTriShapeData) blocks.get(niTriShape.data);

						//scale 4 will get morph treatment later
						boolean morphable = (scale == 4);
						IndexedGeometryArray baseItsa = J3dNiTriShape.createGeometry(data, morphable);

						if (morphable)
						{
							this.addGeometryArray(baseItsa);
						}

						Shape3D shape = new Shape3D();
						shape.clearCapabilities();
						shape.setGeometry(baseItsa);

						BSShaderPPLightingProperty lp = getLightingProperty(niTriShape, blocks);
						if (lp != null)
						{
							BSShaderTextureSet ts = (BSShaderTextureSet) blocks.get(lp.textureSet);
							shape.setAppearance(createAppearance(textureSource.getTexture(ts.textures[0])));
							tg.addChild(shape);
						}
						else
						{
							shape.setAppearance(createBasicWaterApp());
							tg.addChild(shape);
						}
					}
					else
					{
						System.out.println("Lod file child odd " + child + " in " + meshName);
					}
				}
				addChild(tg);
				
				// add child blocks, but notice they are not transformed
				//TODO: these need to unload when a far replaces them I suspect they need a new seperate system
			//	addChild(createBlocks(lodX, lodY, scale, worldFormName, meshSource, textureSource));
				
			}
			else
			{
				System.out.println("Bad landscape NifFile " + meshName);
			}
		}
		else
		{
			//fine the systems just asking for empty space which is fine
			//System.out.println("Bad landscape name " + meshName);
		}

	}

	private Group createBlocks(int lodX, int lodY, int scale, String worldFormName, MeshSource meshSource, TextureSource textureSource)
	{
		String meshName = "landscape\\lod\\" + worldFormName + "\\blocks\\" + worldFormName + ".level" + scale + ".x" + lodX + ".y" + lodY
				+ ".nif";
		System.out.println("loading " + meshName);
		if (meshSource.nifFileExists(meshName))
		{
			NifJ3dVisRoot nvr = NifToJ3d.loadShapes(meshName, meshSource, textureSource);
			
			if (nvr != null)
			{
				System.out.println("loaded fine");
				return nvr.getVisualRoot();
			}

		}
		System.out.println("but null");
		return null;
	}

	private BSShaderPPLightingProperty getLightingProperty(NiTriShape niTriShape, NiObjectList blocks)
	{
		for (NifRef pnr : niTriShape.properties)
		{
			NiProperty p = (NiProperty) blocks.get(pnr);
			if (p instanceof BSShaderPPLightingProperty)
				return (BSShaderPPLightingProperty) p;
		}
		return null;
	}
}
