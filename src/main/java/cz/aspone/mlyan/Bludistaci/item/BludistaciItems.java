package cz.aspone.mlyan.Bludistaci.item;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cz.aspone.mlyan.Bludistaci.Bludistaci;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by jeez on 5.4.17.
 */
public class BludistaciItems {


    public static Item Modry;
    public static Item Zlaty;



    public void preInit(FMLPreInitializationEvent event) {
        Modry =  new ModryBludistak().setUnlocalizedName("ModryItem").setCreativeTab(Bludistaci.bludistaciTab).setTextureName("bludistaci:BM");
        Zlaty = new ZlatyBludistak(Bludistaci.bludistaciTab, "ZlatyItem", "bludistaci:BZ");


        GameRegistry.registerItem(Modry, Modry.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(Zlaty,Zlaty.getUnlocalizedName().substring(5));

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
    /*
    public static void preInit() {
        prvniItem = new Item().setUnlocalizedName("pvni_item").setCreativeTab(Bludistaci.bludistaciTab);
    }

    public static void registerItems() {
        GameRegistry.registerItem(prvniItem, "prvni_item");
    }

    public static void registerRenders() {
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem()
    }
    */

}
