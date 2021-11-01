package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsStandardBlocks extends CreativeTabs{

    public UltraDragonsStandardBlocks(String label) {
        super("ultradragons_standard_blocks_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockInit.DRAGON_CRYSTAL_BLOCK);
    }
}
