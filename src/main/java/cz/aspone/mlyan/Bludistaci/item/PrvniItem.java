package cz.aspone.mlyan.Bludistaci.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
/**
 * Created by jeez on 5.4.17.
 */
public class PrvniItem extends Item {
    public PrvniItem(CreativeTabs creativeTabs, String uniqName, String textureName) {
        this.setCreativeTab(creativeTabs);
        this.setTextureName(textureName);
        this.setUnlocalizedName(uniqName);
    }

    public PrvniItem() {

    }
}
