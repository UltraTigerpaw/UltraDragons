package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsFood extends CreativeTabs{

    public UltraDragonsFood(String label) {
        super("ultradragons_food_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.ALMONDS);
    }
}
