package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsStandardItems extends CreativeTabs{

    public UltraDragonsStandardItems(String label) {
        super("ultradragons_standard_items_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.DRAGON_CRYSTAL);
    }
}
