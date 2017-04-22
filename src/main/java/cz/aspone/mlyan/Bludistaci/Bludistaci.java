package cz.aspone.mlyan.Bludistaci;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cz.aspone.mlyan.Bludistaci.CreativTabsBludistaci.BludistaciTab;
import cz.aspone.mlyan.Bludistaci.Entity.Model_Triceratops;
import cz.aspone.mlyan.Bludistaci.Entity.mcreator_modelMegalodon;
import cz.aspone.mlyan.Bludistaci.block.BludistaciBlocks;
import cz.aspone.mlyan.Bludistaci.item.BludistaciItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cz.aspone.mlyan.Bludistaci.proxy.CommonProxy;


@Mod(modid = Bludistaci.MODID, version = Bludistaci.VERSION, name = Bludistaci.NAME)
public class Bludistaci {
    public static final String MODID = "bludistaci";
    public static final String VERSION = "1.0";
    public static final String NAME = "Bludistaci domaci";

    @SidedProxy(clientSide = "cz.aspone.mlyan.Bludistaci.proxy.ClientProxy", serverSide = "cz.aspone.mlyan.Bludistaci.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static BludistaciItems bludistaciItems;
    public static BludistaciBlocks bludistaciBlocks;

    public static mcreator_modelMegalodon bludistaciMegalodon;
    public static Model_Triceratops bludistaciTriceratops;


    @Mod.Instance
    public static Bludistaci instance;

    public static BludistaciTab bludistaciTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        bludistaciTab = new BludistaciTab(CreativeTabs.getNextID(), "Bludistaci");
        bludistaciItems = new BludistaciItems();
        bludistaciBlocks = new BludistaciBlocks();
        bludistaciMegalodon = new mcreator_modelMegalodon();
        bludistaciTriceratops= new Model_Triceratops();

        proxy.preInit(event);
        bludistaciItems.preInit(event);
        bludistaciBlocks.preInit(event);
        bludistaciMegalodon.preInit(event);
        bludistaciTriceratops.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        bludistaciItems.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        bludistaciItems.postInit(event);
    }
}
