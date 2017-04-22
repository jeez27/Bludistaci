package cz.aspone.mlyan.Bludistaci.item;

import cz.aspone.mlyan.Bludistaci.CreativTabsBludistaci.BludistaciTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by jeez on 6.4.17.
 */
public class ZlatyBludistak extends Item {
    public ZlatyBludistak(CreativeTabs bludistaciTab, String zlatyItem, String nazevTextury) {
        this.setCreativeTab(bludistaciTab);
        this.setUnlocalizedName(zlatyItem);
        this.setTextureName(nazevTextury);
    }
}
