package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsFuels extends CreativeTabs{

    public UltraDragonsFuels(String label) {
        super("ultradragons_fuels_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.OXYGEN_ACETYLENE);
    }
}
