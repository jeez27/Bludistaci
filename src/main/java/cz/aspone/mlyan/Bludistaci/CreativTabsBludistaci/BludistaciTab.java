package cz.aspone.mlyan.Bludistaci.CreativTabsBludistaci;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by jeez on 5.4.17.
 */
public class BludistaciTab extends CreativeTabs {

    public BludistaciTab(int index, String label) {
        super(index , label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.emerald;
    }
}
