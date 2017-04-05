package cz.aspone.mlyan.Bludistaci.item;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by jeez on 5.4.17.
 */
public class BludistaciItems {


    public static Item prvniItem;


    public void preInit(FMLPreInitializationEvent event) {
        prvniItem = new PrvniItem().setUnlocalizedName("PrvniItem");
        GameRegistry.registerItem(prvniItem, prvniItem.getUnlocalizedName().substring(5));

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
