package cz.aspone.mlyan.Bludistaci.block;

import cz.aspone.mlyan.Bludistaci.CreativTabsBludistaci.BludistaciTab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by jeez on 6.4.17.
 */
public class PrvniBlock extends net.minecraft.block.Block {

/*
public PrvniBlock(Material material)    {
super(material);
}
*/

    public PrvniBlock(Material material, CreativeTabs bludistaciTab, String jmenoBloku, String texturaBloku) {
        super(material);
        this.setCreativeTab(bludistaciTab);
        this.setBlockName(jmenoBloku);
        this.setBlockTextureName(texturaBloku);
    }

    public PrvniBlock(Material material) {
        super(material);
    }
}
