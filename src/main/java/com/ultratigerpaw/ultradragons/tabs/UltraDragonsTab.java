package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsTab extends CreativeTabs {

    public UltraDragonsTab(String label) {
        super("ultradragonstab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.DRAGON_CRYSTAL_SHARD);
    }
}
