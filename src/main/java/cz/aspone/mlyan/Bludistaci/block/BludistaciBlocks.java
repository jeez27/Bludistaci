package cz.aspone.mlyan.Bludistaci.block;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cz.aspone.mlyan.Bludistaci.Bludistaci;
import cz.aspone.mlyan.Interface.Initionable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.material.MaterialLogic;

/**
 * Created by jeez on 6.4.17.
 */
public class BludistaciBlocks  implements Initionable{
    public static Block prvniBlock;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
       // prvniBlock = new PrvniBlock(Material.iron).setBlockName("PrvniBlock").setBlockTextureName("bludistaci:PrvniBlock");
       prvniBlock = new PrvniBlock(Material.iron, Bludistaci.bludistaciTab, "PrvniBlock", "bludistaci:PrvniBlock");

        GameRegistry.registerBlock(prvniBlock, prvniBlock.getUnlocalizedName().substring(5));

    }

    @Override
    public void init(FMLInitializationEvent event) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
