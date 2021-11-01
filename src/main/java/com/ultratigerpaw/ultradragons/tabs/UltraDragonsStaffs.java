package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsStaffs extends CreativeTabs{

    public UltraDragonsStaffs(String label) {
        super("ultradragons_staffs_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.STANDARD_LIGHTNING_STAFF);
    }
}
