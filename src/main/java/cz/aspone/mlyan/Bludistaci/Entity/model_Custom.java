package cz.aspone.mlyan.Bludistaci.Entity;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cz.aspone.mlyan.Bludistaci.Bludistaci;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by jeez on 13.4.17.
 */
@SuppressWarnings("unchecked")
public class model_Custom {



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



}
