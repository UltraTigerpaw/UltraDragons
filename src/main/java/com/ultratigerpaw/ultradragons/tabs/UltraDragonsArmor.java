package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsArmor extends CreativeTabs{

    public UltraDragonsArmor(String label) {
        super("ultradragons_armor_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.HELMET_DRAGON_CRYSTAL);
    }
}
