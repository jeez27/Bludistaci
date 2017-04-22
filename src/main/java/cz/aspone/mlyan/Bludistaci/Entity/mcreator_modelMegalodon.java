package cz.aspone.mlyan.Bludistaci.Entity;

import cz.aspone.mlyan.Bludistaci.Bludistaci;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;


import java.util.Random;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.client.registry.RenderingRegistry;

@SuppressWarnings("unchecked")
public class mcreator_modelMegalodon {



    @SideOnly(Side.CLIENT)
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(mcreator_modelMegalodon.EntitymodelMegalodon.class, new RenderLiving(
				new mcreator_modelMegalodon.ModelMegalodon(), 0) {
			protected ResourceLocation getEntityTexture(Entity par1Entity) {
				return new ResourceLocation("bludistaci:textures/entity/ModelMegalodon-texture.png");

			}

		});


	}


	public void preInit(FMLPreInitializationEvent event) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		//mobid = entityID;
		EntityRegistry.registerGlobalEntityID(mcreator_modelMegalodon.EntitymodelMegalodon.class, "modelMegalodon", entityID);
		EntityRegistry.registerModEntity(mcreator_modelMegalodon.EntitymodelMegalodon.class, "modelMegalodon", entityID, Bludistaci.MODID , 64, 1, true);
        this.registerRenderers();
		EntityList.entityEggs.put(entityID, new EntityList.EntityEggInfo(entityID, (255 << 16), (255 << 16)
				+ (255 << 8) + 51));
		EntityRegistry.addSpawn(mcreator_modelMegalodon.EntitymodelMegalodon.class, 20, 3, 30, EnumCreatureType.waterCreature, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga,
                BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.icePlains,
                BiomeGenBase.iceMountains, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.beach,
                BiomeGenBase.desertHills, BiomeGenBase.forestHills, BiomeGenBase.taigaHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.jungle,
                BiomeGenBase.jungleHills, BiomeGenBase.jungleEdge, BiomeGenBase.deepOcean, BiomeGenBase.stoneBeach, BiomeGenBase.coldBeach,
                BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.roofedForest, BiomeGenBase.coldTaiga,
                BiomeGenBase.coldTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.extremeHillsPlus,
                BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau);


	}



	public static class EntitymodelMegalodon extends EntityWolf {
		World world = null;

		public EntitymodelMegalodon(World var1) {
			super(var1);
			world = var1;
			experienceValue = 5;
			this.isImmuneToFire = false;
			addRandomArmor();
			this.tasks.addTask(0, new EntityAISwimming(this));
			this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
			this.tasks.addTask(8, new EntityAILookIdle(this));

		}

		protected void addRandomArmor() {

		}

		public boolean isAIEnabled() {
			return false;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		/**
		 * Returns the sound this mob makes while it's alive.
		 */
		protected String getLivingSound() {

			return "";

		}

		/**
		 * Returns the sound this mob makes when it is hurt.
		 */
		protected String getHurtSound() {
			return "";
		}

		/**
		 * Returns the sound this mob makes on death.
		 */
		protected String getDeathSound() {
			return "";
		}

		public void onStruckByLightning(EntityLightningBolt entityLightningBolt) {
			super.onStruckByLightning(entityLightningBolt);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Entity entity = this;

		}

		protected void fall(float l) {
			super.fall(l);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			super.fall(l);
			Entity entity = this;

		}

		public void onDeath(DamageSource dsource) {
			super.onDeath(dsource);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Entity entity = this;

		}

		public void onKillEntity(EntityLiving entityLiving) {
			super.onKillEntity(entityLiving);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Entity entity = this;

		}

		public boolean interact(EntityPlayer entity) {
			super.interact(entity);
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;

			return true;
		}

		public String getEntityName() {
			return "modelMegalodon";
		}

	}

	// package ModelMegalodon;

	/**
	 * ModelMegalodon - Either Mojang or a mod author Created using Tabula 4.1.1
	 */
	public static class ModelMegalodon extends ModelBase {
		public ModelRenderer Jaw;
		public ModelRenderer Head;
		public ModelRenderer RightPelvic;
		public ModelRenderer Tail1;
		public ModelRenderer Dorsal;
		public ModelRenderer LeftPectoral;
		public ModelRenderer Nose;
		public ModelRenderer Body1;
		public ModelRenderer RightPectoral;
		public ModelRenderer NoseTip;
		public ModelRenderer LeftPelvic;
		public ModelRenderer Tail2;
		public ModelRenderer TailFin;
		public ModelRenderer BackFins;


		public ModelMegalodon() {
			this.textureWidth = 200;
			this.textureHeight = 200;
			this.Tail2 = new ModelRenderer(this, 135, 5);
			this.Tail2.setRotationPoint(4.0F, 3.0F, 13.0F);
			this.Tail2.addBox(-2.5F, -2.0F, 0.0F, 5, 8, 18, 0.0F);
			this.LeftPectoral = new ModelRenderer(this, 115, 168);
			this.LeftPectoral.setRotationPoint(5.0F, 22.0F, 6.0F);
			this.LeftPectoral.addBox(0.0F, 0.0F, -4.0F, 12, 1, 10, 0.0F);
			this.setRotateAngle(LeftPectoral, 0.0F, 0.0F, 0.4363322854042054F);
			this.Head = new ModelRenderer(this, 84, 2);
			this.Head.setRotationPoint(-2.5F, 14.0F, -5.0F);
			this.Head.addBox(-3.5F, -3.0F, -7.0F, 12, 9, 7, 0.0F);
			this.Body1 = new ModelRenderer(this, 6, 152);
			this.Body1.setRotationPoint(-5.5F, 11.0F, -5.0F);
			this.Body1.addBox(0.0F, 0.0F, 0.0F, 11, 13, 27, 0.0F);
			this.Nose = new ModelRenderer(this, 55, 0);
			this.Nose.setRotationPoint(-1.5F, 14.5F, -5.0F);
			this.Nose.addBox(-3.5F, -3.0F, -10.0F, 10, 8, 3, 0.0F);
			this.LeftPelvic = new ModelRenderer(this, 120, 138);
			this.LeftPelvic.setRotationPoint(4.0F, 21.0F, 24.0F);
			this.LeftPelvic.addBox(-1.0F, 0.0F, -3.0F, 7, 1, 7, 0.0F);
			this.setRotateAngle(LeftPelvic, 0.0F, 0.0F, 0.8377580046653748F);
			this.NoseTip = new ModelRenderer(this, 87, 59);
			this.NoseTip.setRotationPoint(-0.5F, 14.5F, -8.0F);
			this.NoseTip.addBox(-3.5F, -3.0F, -10.0F, 8, 7, 3, 0.0F);
			this.setRotateAngle(NoseTip, 0.0F, 0.0F, 0.017453299835324284F);
			this.RightPectoral = new ModelRenderer(this, 21, 101);
			this.RightPectoral.setRotationPoint(-5.0F, 22.0F, 6.0F);
			this.RightPectoral.addBox(-12.0F, 0.0F, -4.0F, 12, 1, 10, 0.0F);
			this.setRotateAngle(RightPectoral, 0.0F, 0.0F, -0.4363322854042054F);
			this.Dorsal = new ModelRenderer(this, 16, 32);
			this.Dorsal.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.Dorsal.addBox(0.0F, 0.0F, 0.0F, 0, 10, 17, 0.0F);
			this.Tail1 = new ModelRenderer(this, 81, 32);
			this.Tail1.setRotationPoint(-4.0F, 11.0F, 22.0F);
			this.Tail1.addBox(0.0F, 0.0F, 0.0F, 8, 11, 13, 0.0F);
			this.setRotateAngle(Tail1, 0.0F, -0.22759093446006062F, 0.0F);
			this.Jaw = new ModelRenderer(this, 37, 74);
			this.Jaw.setRotationPoint(0.0F, 20.0F, -3.0F);
			this.Jaw.addBox(-4.5F, -1.0F, -11.0F, 9, 3, 11, 0.0F);
			this.TailFin = new ModelRenderer(this, 80, 72);
			this.TailFin.setRotationPoint(0.0F, 0.0F, 0.0F);
			this.TailFin.addBox(0.0F, -16.0F, 13.0F, 0, 30, 24, 0.0F);
			this.RightPelvic = new ModelRenderer(this, 45, 136);
			this.RightPelvic.setRotationPoint(-4.0F, 21.0F, 24.0F);
			this.RightPelvic.addBox(-6.0F, 0.0F, -3.0F, 7, 1, 7, 0.0F);
			this.setRotateAngle(RightPelvic, 0.0F, 0.0F, -0.8377580046653748F);
			this.BackFins = new ModelRenderer(this, 30, 0);
			this.BackFins.setRotationPoint(0.0F, 0.0F, 0.0F);
			this.BackFins.addBox(0.0F, -7.0F, 0.0F, 0, 18, 10, 0.0F);
			this.Tail1.addChild(this.Tail2);
			this.Tail2.addChild(this.TailFin);
			this.Tail2.addChild(this.BackFins);


//			parts = new ModelRenderer[]{Jaw, Head, RightPelvic, Tail1, Dorsal, LeftPectoral, Nose, Body1, RightPectoral, NoseTip, LeftPelvic,
//					Tail2, TailFin, BackFins};
//			setInitPose();
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			this.LeftPectoral.render(f5);
			this.Head.render(f5);
			this.Body1.render(f5);
			this.Nose.render(f5);
			this.LeftPelvic.render(f5);
			this.NoseTip.render(f5);
			this.RightPectoral.render(f5);
			this.Dorsal.render(f5);
			this.Tail1.render(f5);
			this.Jaw.render(f5);
			this.RightPelvic.render(f5);
		}

		/**
		 * This is a helper function from Tabula to set the rotation of model
		 * parts
		 */
		public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
			ModelRenderer.rotateAngleX = x;
			ModelRenderer.rotateAngleY = y;
			ModelRenderer.rotateAngleZ = z;
		}

/*
		@override
		public void setRotationAngles() {

		};
       */
	}
}
