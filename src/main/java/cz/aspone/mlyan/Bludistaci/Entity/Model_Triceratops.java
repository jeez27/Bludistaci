package cz.aspone.mlyan.Bludistaci.Entity;

/**
 * Created by jeez on 8.4.17.
 */

/**
        import net.ilexiconn.jurassicraft.client.model.animation.Animator;
        import net.ilexiconn.jurassicraft.client.model.base.MowzieModelBase;
        import net.ilexiconn.jurassicraft.client.model.base.MowzieModelRenderer;
        import net.ilexiconn.jurassicraft.common.api.IAnimatedEntity;
        import net.ilexiconn.jurassicraft.common.data.enums.JurassiCraftAnimationIDs;
        import net.ilexiconn.jurassicraft.common.entity.dinosaurs.EntityTriceratops;
        import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
*/
        import cpw.mods.fml.client.registry.RenderingRegistry;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;
        import cpw.mods.fml.common.registry.EntityRegistry;
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import cz.aspone.mlyan.Bludistaci.Bludistaci;
        import net.minecraft.client.model.ModelBase;
        import net.minecraft.client.model.ModelRenderer;
        import net.minecraft.client.renderer.entity.RenderLiving;
        import net.minecraft.entity.Entity;
        import net.minecraft.entity.EntityList;
        import net.minecraft.entity.EntityLiving;
        import net.minecraft.entity.EnumCreatureType;
        import net.minecraft.entity.ai.EntityAILookIdle;
        import net.minecraft.entity.ai.EntityAISwimming;
        import net.minecraft.entity.ai.EntityAIWander;
        import net.minecraft.entity.effect.EntityLightningBolt;
        import net.minecraft.entity.passive.EntityWolf;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.item.Item;
        import net.minecraft.util.DamageSource;
        import net.minecraft.util.ResourceLocation;
        import net.minecraft.world.World;
        import net.minecraft.world.biome.BiomeGenBase;

public class Model_Triceratops {


    @SideOnly(Side.CLIENT)
    public void registerRenderers() {

        RenderingRegistry.registerEntityRenderingHandler(Model_Triceratops.Entity_Triceratops.class, new RenderLiving(
                new Model_Triceratops.Model_TriceratopsModel(), 0) {
            protected ResourceLocation getEntityTexture(Entity par1Entity) {
                return new ResourceLocation("bludistaci:textures/entity/ModelMegalodon-texture.png");

            }

        });


    }

    public void preInit(FMLPreInitializationEvent event) {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        //mobid = entityID;
        EntityRegistry.registerGlobalEntityID(Model_Triceratops.Entity_Triceratops.class, "modelTriceratops", entityID);
        EntityRegistry.registerModEntity(Model_Triceratops.Entity_Triceratops.class, "modelTriceratops", entityID, Bludistaci.MODID , 64, 1, true);
        this.registerRenderers();
        EntityList.entityEggs.put(entityID, new EntityList.EntityEggInfo(entityID, (255 << 16), (255 << 16)
                + (255 << 8) + 51));
        EntityRegistry.addSpawn(Model_Triceratops.Entity_Triceratops.class, 20, 3, 30, EnumCreatureType.waterCreature, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga,
                BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.icePlains,
                BiomeGenBase.iceMountains, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.beach,
                BiomeGenBase.desertHills, BiomeGenBase.forestHills, BiomeGenBase.taigaHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.jungle,
                BiomeGenBase.jungleHills, BiomeGenBase.jungleEdge, BiomeGenBase.deepOcean, BiomeGenBase.stoneBeach, BiomeGenBase.coldBeach,
                BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.roofedForest, BiomeGenBase.coldTaiga,
                BiomeGenBase.coldTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.extremeHillsPlus,
                BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau);


    }



    public class Entity_Triceratops extends EntityWolf{

        World world = null;

        public Entity_Triceratops(World var1) {
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



    public class  Model_TriceratopsModel extends ModelBase {
        public ModelRenderer BackCalfLeft;
        public ModelRenderer BackCalfRight;
        public ModelRenderer BackThighLeft;
        public ModelRenderer BackThighRight;
        public ModelRenderer FrontCalfLeft;
        public ModelRenderer FrontCalfRight;
        public ModelRenderer FrontThighLeft;
        public ModelRenderer FrontThighRight;
        public ModelRenderer Tail1;
        public ModelRenderer Tail2;
        public ModelRenderer Tail3;
        public ModelRenderer Tail4;
        public ModelRenderer Tail5;
        public ModelRenderer Chest;
        public ModelRenderer Neck;
        public ModelRenderer Head;
        public ModelRenderer Mouth;
        public ModelRenderer Shieldthingy1;
        public ModelRenderer Shieldthingy2;
        public ModelRenderer Shieldthingy3;
        public ModelRenderer MiddleHorn;
        public ModelRenderer LeftHorn;
        public ModelRenderer RightBackFoot;
        public ModelRenderer LeftBackFoot;
        public ModelRenderer Waist;
        public ModelRenderer RightHorn;
        public ModelRenderer Shieldthingy4;
        public ModelRenderer Shieldthingy5;
        public ModelRenderer Shieldthingy6;
        public ModelRenderer Shieldthingy7;
        public ModelRenderer Shieldthingy8;
        public ModelRenderer Shieldthingy9;
        public ModelRenderer Shieldthingy10;
        public ModelRenderer Shieldthingy11;
        public ModelRenderer Shieldthingy12;
        public ModelRenderer Shieldthingy13;
        public ModelRenderer Collar;
        public ModelRenderer LeftFrontFoot;
        public ModelRenderer RightFrontFoot;
        //public ModelRenderer[] tailParts;
        //private Animator animator = new Animator(this).render(f5);

        public Model_TriceratopsModel() {
            this.textureWidth = 256;
            this.textureHeight = 256;
            this.Tail3 = new ModelRenderer(this, 37, 141);
            this.Tail3.setRotationPoint(0.0F, 2.5F, 28.0F);
            this.Tail3.addBox(-4.0F, -3.0F, 0.0F, 8, 9, 7);
            this.setRotation(this.Tail3, -0.10471976F, -0.0F, 0.0F);
            this.Shieldthingy3 = new ModelRenderer(this, 31, 219);
            this.Shieldthingy3.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy3.addBox(1.3F, -1.6F, -2.5F, 4, 3, 4);
            this.setRotation(this.Shieldthingy3, -0.6806784F, -0.0F, 0.0F);
            this.LeftHorn = new ModelRenderer(this, 36, 52);
            this.LeftHorn.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.LeftHorn.addBox(2.3F, -16.0F, -0.9F, 2, 16, 2);
            this.setRotation(this.LeftHorn, 0.89011794F, -0.0F, 0.0F);
            this.FrontThighLeft = new ModelRenderer(this, 182, 29);
            this.FrontThighLeft.setRotationPoint(8.0F, 1.0F, -10.0F);
            this.FrontThighLeft.addBox(-2.0F, 0.0F, -3.5F, 5, 15, 7);
            this.setRotation(this.FrontThighLeft, 0.30353022F, -0.017453292F, 0.0F);
            this.Tail4 = new ModelRenderer(this, 0, 147);
            this.Tail4.setRotationPoint(0.0F, 3.0F, 30.0F);
            this.Tail4.addBox(-3.0F, -2.0F, 0.0F, 6, 7, 11);
            this.setRotation(this.Tail4, -0.04782202F, -0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 168);
            this.Mouth.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Mouth.addBox(-3.0F, 1.7F, -15.0F, 6, 7, 6);
            this.setRotation(this.Mouth, 0.30806613F, -0.0F, 0.0F);
            this.FrontThighRight = new ModelRenderer(this, 147, 29);
            this.FrontThighRight.setRotationPoint(-8.0F, 1.0F, -10.0F);
            this.FrontThighRight.addBox(-3.0F, 0.0F, -3.5F, 5, 15, 7);
            this.setRotation(this.FrontThighRight, 0.30353022F, -0.0F, 0.0F);
            this.BackThighRight = new ModelRenderer(this, 147, 0);
            this.BackThighRight.setRotationPoint(-8.5F, -2.0F, 10.0F);
            this.BackThighRight.addBox(-4.5F, 0.0F, -3.5F, 5, 16, 9);
            this.setRotation(this.BackThighRight, -0.32623693F, -0.0F, 0.0F);
            this.RightHorn = new ModelRenderer(this, 36, 52);
            this.RightHorn.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.RightHorn.addBox(-4.3F, -16.0F, -0.9F, 2, 16, 2);
            this.setRotation(this.RightHorn, 0.89011794F, -0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 95);
            this.Tail1.setRotationPoint(0.0F, -5.8F, 15.0F);
            this.Tail1.addBox(-6.0F, 0.0F, 0.0F, 12, 14, 10);
            this.setRotation(this.Tail1, -0.23825294F, -0.0F, 0.0F);
            this.BackCalfLeft = new ModelRenderer(this, 236, 0);
            this.BackCalfLeft.setRotationPoint(10.5F, 9.4F, 2.7F);
            this.BackCalfLeft.addBox(-2.0F, 0.0F, 0.0F, 4, 13, 5);
            this.setRotation(this.BackCalfLeft, 0.3436956F, -0.0F, 0.0F);
            this.Shieldthingy12 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy12.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy12.addBox(8.0F, -8.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy12, -0.31715423F, -0.0F, 0.017453292F);
            this.Neck = new ModelRenderer(this, 0, 184);
            this.Neck.setRotationPoint(0.0F, -3.1F, -15.0F);
            this.Neck.addBox(-4.5F, 0.0F, -7.0F, 9, 10, 8);
            this.setRotation(this.Neck, 0.017453292F, -0.0F, 0.0F);
            this.Shieldthingy7 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy7.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy7.addBox(-4.0F, -10.5F, 0.5F, 3, 2, 1);
            this.setRotation(this.Shieldthingy7, -0.31415927F, -0.0F, 0.0F);
            this.RightBackFoot = new ModelRenderer(this, 0, 0);
            this.RightBackFoot.setRotationPoint(-10.5F, 20.0F, 11.8F);
            this.RightBackFoot.addBox(-2.0F, 0.0F, -5.0F, 4, 4, 5);
            this.setRotation(this.RightBackFoot, -2.790295E-16F, -0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 14, 219);
            this.Chest.setRotationPoint(0.0F, -6.2F, 0.6F);
            this.Chest.addBox(-8.0F, 0.0F, -16.0F, 16, 17, 17);
            this.setRotation(this.Chest, 0.11152654F, -0.0F, 0.0F);
            this.Shieldthingy1 = new ModelRenderer(this, 0, 71);
            this.Shieldthingy1.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy1.addBox(-9.0F, -9.5F, 0.0F, 18, 18, 2);
            this.setRotation(this.Shieldthingy1, -0.31415927F, -0.0F, 0.0F);
            this.Shieldthingy6 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy6.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy6.addBox(1.0F, -10.5F, 0.5F, 3, 2, 1);
            this.setRotation(this.Shieldthingy6, -0.31415927F, -0.0F, 0.0F);
            this.Shieldthingy11 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy11.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy11.addBox(8.0F, 0.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy11, -0.31715423F, -0.0F, 0.017453292F);
            this.FrontCalfLeft = new ModelRenderer(this, 235, 23);
            this.FrontCalfLeft.setRotationPoint(8.5F, 13.0F, -3.4F);
            this.FrontCalfLeft.addBox(-2.0F, 0.0F, -5.0F, 4, 9, 5);
            this.setRotation(this.FrontCalfLeft, -0.32324737F, -0.0F, 0.0F);
            this.Shieldthingy9 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy9.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy9.addBox(-10.0F, -4.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy9, -0.31715423F, -0.0F, 0.017453292F);
            this.Tail5 = new ModelRenderer(this, 37, 162);
            this.Tail5.setRotationPoint(0.0F, 4.0F, 38.0F);
            this.Tail5.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 11);
            this.setRotation(this.Tail5, -0.010646508F, -0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 0, 123);
            this.Tail2.setRotationPoint(0.0F, 0.0F, 22.0F);
            this.Tail2.addBox(-4.5F, -3.0F, 0.0F, 9, 12, 8);
            this.setRotation(this.Tail2, -0.16161749F, -0.0F, 0.0F);
            this.FrontCalfRight = new ModelRenderer(this, 212, 24);
            this.FrontCalfRight.setRotationPoint(-8.5F, 13.0F, -3.4F);
            this.FrontCalfRight.addBox(-2.0F, 0.0F, -5.0F, 4, 9, 5);
            this.setRotation(this.FrontCalfRight, -0.32325244F, -0.0F, 0.0F);
            this.LeftFrontFoot = new ModelRenderer(this, 0, 0);
            this.LeftFrontFoot.setRotationPoint(8.5F, 20.0F, -11.0F);
            this.LeftFrontFoot.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 5);
            this.setRotation(this.LeftFrontFoot, -2.790295E-16F, -0.0F, 0.0F);
            this.Shieldthingy4 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy4.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy4.addBox(-10.0F, -8.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy4, -0.31715423F, -0.0F, 0.017453292F);
            this.Waist = new ModelRenderer(this, 94, 217);
            this.Waist.setRotationPoint(0.0F, -2.0F, 10.0F);
            this.Waist.addBox(-8.5F, -5.0F, -10.4F, 17, 18, 17);
            this.setRotation(this.Waist, -0.037175514F, -0.0F, 0.0F);
            this.Shieldthingy2 = new ModelRenderer(this, 31, 219);
            this.Shieldthingy2.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy2.addBox(-5.3F, -1.6F, -2.5F, 4, 3, 4);
            this.setRotation(this.Shieldthingy2, -0.6806784F, -0.0F, 0.0F);
            this.Shieldthingy8 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy8.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy8.addBox(-8.0F, -10.5F, 0.5F, 3, 2, 1);
            this.setRotation(this.Shieldthingy8, -0.31415927F, -0.0F, 0.0F);
            this.RightFrontFoot = new ModelRenderer(this, 0, 0);
            this.RightFrontFoot.setRotationPoint(-8.5F, 20.0F, -11.0F);
            this.RightFrontFoot.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 5);
            this.setRotation(this.RightFrontFoot, -2.790295E-16F, -0.0F, 0.0F);
            this.Collar = new ModelRenderer(this, 28, 229);
            this.Collar.setRotationPoint(0.0F, -2.8F, -8.0F);
            this.Collar.addBox(-6.0F, 0.0F, 0.0F, 12, 14, 7);
            this.setRotation(this.Collar, -0.80424774F, -0.0F, 0.0F);
            this.BackThighLeft = new ModelRenderer(this, 180, 0);
            this.BackThighLeft.setRotationPoint(8.5F, -2.0F, 10.0F);
            this.BackThighLeft.addBox(-0.5F, 0.0F, -3.5F, 5, 16, 9);
            this.setRotation(this.BackThighLeft, -0.32847098F, -0.0F, 0.0F);
            this.BackCalfRight = new ModelRenderer(this, 213, 0);
            this.BackCalfRight.setRotationPoint(-10.5F, 9.4F, 2.7F);
            this.BackCalfRight.addBox(-2.0F, 0.0F, 0.0F, 4, 13, 5);
            this.setRotation(this.BackCalfRight, 0.34369022F, -0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 37, 182);
            this.Head.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Head.addBox(-5.0F, 0.0F, -10.0F, 10, 10, 10);
            this.setRotation(this.Head, 0.17907698F, -0.0F, 0.0F);
            this.MiddleHorn = new ModelRenderer(this, 23, 59);
            this.MiddleHorn.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.MiddleHorn.addBox(-1.0F, 2.5F, -13.0F, 2, 4, 2);
            this.setRotation(this.MiddleHorn, 0.034906585F, -0.0F, 0.0F);
            this.LeftBackFoot = new ModelRenderer(this, 0, 0);
            this.LeftBackFoot.setRotationPoint(10.5F, 20.0F, 11.8F);
            this.LeftBackFoot.addBox(-2.0F, 0.0F, -5.0F, 4, 4, 5);
            this.setRotation(this.LeftBackFoot, -2.790295E-16F, -0.0F, 0.0F);
            this.Shieldthingy13 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy13.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy13.addBox(8.0F, -4.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy13, -0.31715423F, -0.0F, 0.017453292F);
            this.Shieldthingy5 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy5.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy5.addBox(5.0F, -10.5F, 0.5F, 3, 2, 1);
            this.setRotation(this.Shieldthingy5, -0.31415927F, -0.0F, 0.0F);
            this.Shieldthingy10 = new ModelRenderer(this, 26, 40);
            this.Shieldthingy10.setRotationPoint(0.0F, -2.9F, -22.0F);
            this.Shieldthingy10.addBox(-10.0F, 0.0F, 0.5F, 2, 3, 1);
            this.setRotation(this.Shieldthingy10, -0.31715423F, -0.0F, 0.017453292F);
            this.MiddleHorn.addChild(this.Mouth);
            this.Mouth.addChild(this.Head);
            this.Shieldthingy1.addChild(this.Head);
            this.Shieldthingy2.addChild(this.Head);
            this.Shieldthingy3.addChild(this.Head);
            this.Shieldthingy4.addChild(this.Head);
            this.Shieldthingy5.addChild(this.Head);
            this.Shieldthingy6.addChild(this.Head);
            this.Shieldthingy7.addChild(this.Head);
            this.Shieldthingy8.addChild(this.Head);
            this.Shieldthingy9.addChild(this.Head);
            this.Shieldthingy9.addChild(this.Head);
            this.Shieldthingy10.addChild(this.Head);
            this.Shieldthingy11.addChild(this.Head);
            this.Shieldthingy12.addChild(this.Head);
            this.Shieldthingy13.addChild(this.Head);
            this.LeftHorn.addChild(this.Head);
            this.RightHorn.addChild(this.Head);
            this.LeftFrontFoot.addChild(this.FrontCalfLeft);
            this.FrontCalfLeft.addChild(this.FrontThighLeft);
            this.RightFrontFoot.addChild(this.FrontCalfRight);
            this.FrontCalfRight.addChild(this.FrontThighRight);
            this.FrontThighRight.addChild(this.Chest);
            this.FrontThighLeft.addChild(this.Chest);
            this.LeftBackFoot.addChild(this.BackCalfLeft);
            this.BackCalfLeft.addChild(this.BackThighLeft);
            this.RightBackFoot.addChild(this.BackCalfRight);
            this.BackCalfRight.addChild(this.BackThighRight);
            this.Head.addChild(this.Neck);
            this.Neck.addChild(this.Chest);
            this.Collar.addChild(this.Chest);
            this.Chest.addChild(this.Waist);
            this.Tail5.addChild(this.Tail4);
            this.Tail4.addChild(this.Tail3);
            this.Tail3.addChild(this.Tail2);
            this.Tail2.addChild(this.Tail1);
            this.Tail1.addChild(this.Waist);
            this.MiddleHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy1.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy2.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy3.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy4.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy5.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy6.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy7.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy8.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy9.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy10.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy11.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy12.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Shieldthingy13.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.LeftHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.RightHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
            this.Chest.setRotationPoint(0.0F, -5.0F, -10.0F);
            this.Tail1.setRotationPoint(0.0F, -4.0F, 5.0F);

        /*
        this.Tail1.field_78795_f = (float)((double)this.Tail1.field_78795_f - 0.2D);
        this.Tail2.field_78795_f = (float)((double)this.Tail2.field_78795_f - 0.3D);
        this.Tail3.field_78795_f = (float)((double)this.Tail3.field_78795_f + 0.1D);
        this.Tail4.field_78795_f = (float)((double)this.Tail4.field_78795_f + 0.1D);
        this.Tail5.field_78795_f = (float)((double)this.Tail5.field_78795_f + 0.05D);
        this.Waist.field_78795_f = (float)((double)this.Waist.field_78795_f + 0.07D);
        this.FrontThighLeft.field_78795_f = (float)((double)this.FrontThighLeft.field_78795_f - 0.07D);
        this.FrontThighRight.field_78795_f = (float)((double)this.FrontThighRight.field_78795_f - 0.07D);
        this.Neck.field_78795_f = (float)((double)this.Neck.field_78795_f - 0.07D);
        this.tailParts = new ModelRenderer[]{this.Tail5.addChild( this.Tail4.addChild( this.Tail3.addChild( this.Tail2.addChild( this.Tail1};
        this.BackCalfLeft.updateDefaultPose();
        this.BackCalfRight.updateDefaultPose();
        this.BackThighLeft.updateDefaultPose();
        this.BackThighRight.updateDefaultPose();
        this.FrontCalfLeft.updateDefaultPose();
        this.FrontCalfRight.updateDefaultPose();
        this.FrontThighLeft.updateDefaultPose();
        this.FrontThighRight.updateDefaultPose();
        this.Tail1.updateDefaultPose();
        this.Tail2.updateDefaultPose();
        this.Tail3.updateDefaultPose();
        this.Tail4.updateDefaultPose();
        this.Tail5.updateDefaultPose();
        this.Chest.updateDefaultPose();
        this.Neck.updateDefaultPose();
        this.Head.updateDefaultPose();
        this.Mouth.updateDefaultPose();
        this.Shieldthingy1.updateDefaultPose();
        this.Shieldthingy2.updateDefaultPose();
        this.Shieldthingy3.updateDefaultPose();
        this.MiddleHorn.updateDefaultPose();
        this.LeftHorn.updateDefaultPose();
        this.RightBackFoot.updateDefaultPose();
        this.LeftBackFoot.updateDefaultPose();
        this.Waist.updateDefaultPose();
        this.RightHorn.updateDefaultPose();
        this.Shieldthingy4.updateDefaultPose();
        this.Shieldthingy5.updateDefaultPose();
        this.Shieldthingy6.updateDefaultPose();
        this.Shieldthingy7.updateDefaultPose();
        this.Shieldthingy8.updateDefaultPose();
        this.Shieldthingy9.updateDefaultPose();
        this.Shieldthingy10.updateDefaultPose();
        this.Shieldthingy11.updateDefaultPose();
        this.Shieldthingy12.updateDefaultPose();
        this.Shieldthingy13.updateDefaultPose();
        this.Collar.updateDefaultPose();
        this.LeftFrontFoot.updateDefaultPose();
        this.RightFrontFoot.updateDefaultPose();
        */
        }


            @Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
                this.BackCalfLeft.render(f5);
                this.BackCalfRight.render(f5);
                this.BackThighLeft.render(f5);
                this.BackThighRight.render(f5);
                this.FrontCalfLeft.render(f5);
                this.FrontCalfRight.render(f5);
                this.FrontThighLeft.render(f5);
                this.FrontThighRight.render(f5);
                this.Tail1.render(f5);
                this.Tail2.render(f5);
                this.Tail3.render(f5);
                this.Tail4.render(f5);
                this.Tail5.render(f5);
                this.Chest.render(f5);
                this.Neck.render(f5);
                this.Head.render(f5);
                this.Mouth.render(f5);
                this.Shieldthingy1.render(f5);
                this.Shieldthingy2.render(f5);
                this.Shieldthingy3.render(f5);
                this.MiddleHorn.render(f5);
                this.LeftHorn.render(f5);
                this.RightBackFoot.render(f5);
                this.LeftBackFoot.render(f5);
                this.Waist.render(f5);
                this.RightHorn.render(f5);
                this.Shieldthingy4.render(f5);
                this.Shieldthingy5.render(f5);
                this.Shieldthingy6.render(f5);
                this.Shieldthingy7.render(f5);
                this.Shieldthingy8.render(f5);
                this.Shieldthingy9.render(f5);
                this.Shieldthingy10.render(f5);
                this.Shieldthingy11.render(f5);
                this.Shieldthingy12.render(f5);
                this.Shieldthingy13.render(f5);
                this.Collar.render(f5);
                this.LeftFrontFoot.render(f5);
                this.RightFrontFoot.render(f5);


            /*
                this.Waist.render(f5);
                this.BackThighLeft.render(f5);
                this.BackThighRight.render(f5);
                */
            }

        private void setRotation(ModelRenderer model, float x, float y, float z) {
            model.rotateAngleX = x;
            model.rotateAngleY = y;
            model.rotateAngleZ = z;
        }
/*
    public void resetPose() {
        this.BackCalfLeft.resetToDefaultPose();
        this.BackCalfRight.resetToDefaultPose();
        this.BackThighLeft.resetToDefaultPose();
        this.BackThighRight.resetToDefaultPose();
        this.FrontCalfLeft.resetToDefaultPose();
        this.FrontCalfRight.resetToDefaultPose();
        this.FrontThighLeft.resetToDefaultPose();
        this.FrontThighRight.resetToDefaultPose();
        this.Tail1.resetToDefaultPose();
        this.Tail2.resetToDefaultPose();
        this.Tail3.resetToDefaultPose();
        this.Tail4.resetToDefaultPose();
        this.Tail5.resetToDefaultPose();
        this.Chest.resetToDefaultPose();
        this.Neck.resetToDefaultPose();
        this.Head.resetToDefaultPose();
        this.Mouth.resetToDefaultPose();
        this.Shieldthingy1.resetToDefaultPose();
        this.Shieldthingy2.resetToDefaultPose();
        this.Shieldthingy3.resetToDefaultPose();
        this.MiddleHorn.resetToDefaultPose();
        this.LeftHorn.resetToDefaultPose();
        this.RightBackFoot.resetToDefaultPose();
        this.LeftBackFoot.resetToDefaultPose();
        this.Waist.resetToDefaultPose();
        this.RightHorn.resetToDefaultPose();
        this.Shieldthingy4.resetToDefaultPose();
        this.Shieldthingy5.resetToDefaultPose();
        this.Shieldthingy6.resetToDefaultPose();
        this.Shieldthingy7.resetToDefaultPose();
        this.Shieldthingy8.resetToDefaultPose();
        this.Shieldthingy9.resetToDefaultPose();
        this.Shieldthingy10.resetToDefaultPose();
        this.Shieldthingy11.resetToDefaultPose();
        this.Shieldthingy12.resetToDefaultPose();
        this.Shieldthingy13.resetToDefaultPose();
        this.Collar.resetToDefaultPose();
        this.LeftFrontFoot.resetToDefaultPose();
        this.RightFrontFoot.resetToDefaultPose();
    }
*/
/*
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityTriceratops triceratops) {
        super.func_78087_a(f, f1, f2, f3, f4, f5, triceratops);
        this.resetPose();
        float sprintModifier = (float)(1.0D / (1.0D + Math.exp(30.0D * ((double)(-f1) + 0.92D))));
        float legOffsetModifier = 2.5F;
        float bobBase = 2.0F;
        if((double)sprintModifier >= 0.9D) {
            bobBase = 1.0F;
        }

        float scaleFactor = 0.5F;
        float height = 0.5F;
        float frontOffset = -2.0F;
        float animationDegree = 2.0F - sprintModifier * 0.2F;
        float defPosProgress = triceratops.defendingPosition.getAnimationProgressSinSqrt();
        this.faceTarget(f3, f4, 1.0F, new AdvancedModelRenderer[]{this.Head.addChild( this.Neck});
        this.bob(this.Waist, bobBase * scaleFactor, height, false, f, f1);
        this.bob(this.BackThighLeft, bobBase * scaleFactor, height, false, f, f1);
        this.bob(this.BackThighRight, bobBase * scaleFactor, height, false, f, f1);
        this.walk(this.Waist, bobBase * scaleFactor, 0.1F * height, true, -1.5F, 0.0F, f, f1);
        this.walk(this.Head, bobBase * scaleFactor, 0.1F * height, false, -1.5F, 0.0F, f, f1);
        this.Waist.field_78795_f = (float)((double)this.Waist.field_78795_f + 0.1D * (double)sprintModifier);
        this.Head.field_78795_f = (float)((double)this.Head.field_78795_f + 0.6D * (double)sprintModifier);
        this.walk(this.BackThighLeft, 1.0F * scaleFactor, 0.2F * animationDegree, false, 0.0F + sprintModifier * legOffsetModifier, 0.0F + sprintModifier * 0.2F, f, f1);
        this.walk(this.BackCalfLeft, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, true, 1.0F + sprintModifier * legOffsetModifier, 0.0F, f, f1);
        this.walk(this.LeftBackFoot, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, false, 1.5F + sprintModifier * legOffsetModifier, 0.0F, f, f1);
        this.walk(this.BackThighRight, 1.0F * scaleFactor, 0.2F * animationDegree, true, 0.0F, 0.0F + sprintModifier * 0.2F, f, f1);
        this.walk(this.BackCalfRight, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, false, 1.0F, 0.0F, f, f1);
        this.walk(this.RightBackFoot, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, true, 1.5F, 0.0F, f, f1);
        this.walk(this.FrontThighRight, 1.0F * scaleFactor, 0.2F * animationDegree, true, frontOffset + 0.0F, -0.1F + sprintModifier * 0.2F, f, f1);
        this.walk(this.FrontCalfRight, 1.0F * scaleFactor, 0.1F * animationDegree, true, frontOffset + 1.0F, -0.2F, f, f1);
        this.walk(this.RightFrontFoot, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, false, frontOffset + 1.5F, 0.0F, f, f1);
        this.walk(this.FrontThighLeft, 1.0F * scaleFactor, 0.2F * animationDegree, false, frontOffset + 0.0F + sprintModifier * legOffsetModifier, -0.1F + sprintModifier * 0.2F, f, f1);
        this.walk(this.FrontCalfLeft, 1.0F * scaleFactor, 0.1F * animationDegree, false, frontOffset + 1.0F + sprintModifier * legOffsetModifier, -0.2F, f, f1);
        this.walk(this.LeftFrontFoot, 1.0F * scaleFactor, 0.2F * animationDegree - sprintModifier * 0.1F, true, frontOffset + 1.5F + sprintModifier * legOffsetModifier, 0.0F, f, f1);
        this.chainWave(this.tailParts, bobBase * scaleFactor, 0.03F, 1.0D, f, f1);
        this.walk(this.Neck, 0.1F, 0.07F, false, -1.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.Head, 0.1F, 0.07F, true, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.Waist, 0.1F, 0.025F, false, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        float inverseKinematicsConstant = 0.3F;
        this.walk(this.FrontThighRight, 0.1F, 0.1F * inverseKinematicsConstant, false, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.FrontCalfRight, 0.1F, 0.3F * inverseKinematicsConstant, true, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.RightFrontFoot, 0.1F, 0.175F * inverseKinematicsConstant, false, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.FrontThighLeft, 0.1F, 0.1F * inverseKinematicsConstant, false, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.FrontCalfLeft, 0.1F, 0.3F * inverseKinematicsConstant, true, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.walk(this.LeftFrontFoot, 0.1F, 0.175F * inverseKinematicsConstant, false, 0.0F, 0.0F, (float)triceratops.frame, 1.0F);
        this.FrontThighRight.field_78798_e = (float)((double)this.FrontThighRight.field_78798_e - 0.5D * Math.cos((double)((float)triceratops.frame * 0.1F)));
        this.FrontThighLeft.field_78798_e = (float)((double)this.FrontThighLeft.field_78798_e - 0.5D * Math.cos((double)((float)triceratops.frame * 0.1F)));
        this.chainSwing(this.tailParts, 0.1F, 0.05F, 2.0D, (float)triceratops.frame, 1.0F);
        this.chainWave(this.tailParts, 0.1F, -0.05F, 1.0D, (float)triceratops.frame, 1.0F);
        triceratops.tailBuffer.applyChainSwingBuffer(this.tailParts);
        this.Head.field_78808_h = (float)((double)this.Head.field_78808_h + Math.cos((double)triceratops.frame) * (double)triceratops.flailDegree.value / 3.0D);
        this.FrontThighRight.field_78795_f = (float)((double)this.FrontThighRight.field_78795_f + Math.cos((double)(triceratops.frame / 3)) * (double)triceratops.flailDegree.value * 0.3D);
        this.FrontCalfRight.field_78795_f = (float)((double)this.FrontCalfRight.field_78795_f + Math.cos(((double)triceratops.frame + 1.5D) / 3.0D) * (double)triceratops.flailDegree.value * 0.4D);
        this.RightFrontFoot.field_78795_f = (float)((double)this.RightFrontFoot.field_78795_f + Math.cos((double)((-triceratops.frame + 3) / 3)) * (double)triceratops.flailDegree.value * 0.3D);
        this.FrontThighLeft.field_78795_f = (float)((double)this.FrontThighLeft.field_78795_f + Math.cos((double)(triceratops.frame / 3)) * (double)triceratops.flailDegree.value * -0.3D);
        this.FrontCalfLeft.field_78795_f = (float)((double)this.FrontCalfLeft.field_78795_f + Math.cos(((double)triceratops.frame + 1.5D) / 3.0D) * (double)triceratops.flailDegree.value * -0.4D);
        this.LeftFrontFoot.field_78795_f = (float)((double)this.LeftFrontFoot.field_78795_f + Math.cos((double)((triceratops.frame - 3) / 3)) * (double)triceratops.flailDegree.value * -0.3D);
        this.Waist.field_78795_f += 0.25F * defPosProgress;
        this.Neck.field_78795_f -= 0.1F * defPosProgress;
        this.Neck.field_78798_e += 1.0F * defPosProgress;
        this.Head.field_78795_f -= 0.15F * defPosProgress;
        this.Head.field_78798_e += 1.0F * defPosProgress;
        this.FrontThighLeft.field_78795_f += 0.125F * defPosProgress;
        this.FrontThighRight.field_78795_f += 0.125F * defPosProgress;
        this.FrontCalfLeft.field_78795_f -= 0.55F * defPosProgress;
        this.FrontCalfRight.field_78795_f -= 0.55F * defPosProgress;
        this.LeftFrontFoot.field_78795_f += 0.25F * defPosProgress;
        this.RightFrontFoot.field_78795_f += 0.25F * defPosProgress;
        this.Tail1.field_78795_f -= 0.2F * defPosProgress;
        this.FrontThighLeft.field_78795_f = (float)((double)this.FrontThighLeft.field_78795_f + 0.2D * (double)defPosProgress * (Math.cos(0.3D * (double)triceratops.frame + Math.sin(0.3D * (double)triceratops.frame)) + 1.0D));
        this.FrontCalfLeft.field_78795_f = (float)((double)this.FrontCalfLeft.field_78795_f - 0.2D * (double)defPosProgress * (Math.cos(0.3D * (double)triceratops.frame - 1.0D + Math.sin(0.3D * (double)triceratops.frame - 1.0D)) + 1.0D));
        this.LeftFrontFoot.field_78795_f = (float)((double)this.LeftFrontFoot.field_78795_f + 0.1D * (double)defPosProgress * (Math.cos(0.3D * (double)triceratops.frame + Math.sin(0.3D * (double)triceratops.frame)) + 1.0D));
    }
*/
/*
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.animator.update(entity);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, (EntityTriceratops)entity);
        if(entity.getAnimationId() == JurassiCraftAnimationIDs.CHARGE.animID()) {
            this.animator.setAnimation(JurassiCraftAnimationIDs.CHARGE.animID());
            this.animator.startPhase(4);
            this.animator.rotate(this.Waist, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, 0.125F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, 0.125F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, -0.55F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfRight, -0.55F, 0.0F, 0.0F);
            this.animator.rotate(this.LeftFrontFoot, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.RightFrontFoot, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.Tail1, -0.2F, 0.0F, 0.0F);
            this.animator.endPhase();
            this.animator.setStationaryPhase(2);
            this.animator.startPhase(8);
            this.animator.rotate(this.Waist, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.Chest, 0.2F, 0.0F, 0.0F);
            this.animator.rotate(this.Head, 0.2F, 0.0F, 0.0F);
            this.animator.rotate(this.Tail1, 0.3F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, 0.1F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, 0.1F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfRight, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.LeftFrontFoot, 0.1F, 0.0F, 0.0F);
            this.animator.rotate(this.RightFrontFoot, 0.1F, 0.0F, 0.0F);
            this.animator.endPhase();
            this.animator.setStationaryPhase(3);
            this.animator.startPhase(6);
            this.animator.rotate(this.Waist, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfRight, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.LeftFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.RightFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.Head, 0.2F, 0.0F, 0.0F);
            this.animator.rotate(this.Tail1, -0.2F, 0.0F, 0.0F);
            this.animator.endPhase();
            this.animator.setStationaryPhase(2);
            this.animator.startPhase(3);
            this.animator.rotate(this.Waist, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfRight, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.LeftFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.RightFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.Head, 0.2F, 0.3F, 0.0F);
            this.animator.rotate(this.Tail1, -0.2F, 0.0F, 0.0F);
            this.animator.rotate(this.Chest, 0.0F, -0.3F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, 0.7F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, 0.3F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, 0.0F, 0.5F, 0.0F);
            this.animator.endPhase();
            this.animator.setStationaryPhase(1);
            this.animator.startPhase(10);
            this.animator.rotate(this.Waist, 0.25F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighLeft, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontThighRight, -0.4F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfLeft, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.FrontCalfRight, -0.49F, 0.0F, 0.0F);
            this.animator.rotate(this.LeftFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.RightFrontFoot, 0.6F, 0.0F, 0.0F);
            this.animator.rotate(this.Head, 0.2F, 0.0F, 0.0F);
            this.animator.rotate(this.Tail1, -0.2F, 0.0F, 0.0F);
            this.animator.endPhase();
            this.animator.resetPhase(10);
            this.animator.setStationaryPhase(51);
        }

    }
    */
    }
}