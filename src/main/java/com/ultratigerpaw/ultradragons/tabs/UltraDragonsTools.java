package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsTools extends CreativeTabs{

    public UltraDragonsTools(String label) {
        super("ultradragons_tools_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.SWORD_DRAGON_CRYSTAL);
    }
}
