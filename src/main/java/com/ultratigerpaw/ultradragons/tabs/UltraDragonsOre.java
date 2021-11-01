package com.ultratigerpaw.ultradragons.tabs;

import com.ultratigerpaw.ultradragons.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltraDragonsOre extends CreativeTabs{

    public UltraDragonsOre(String label) {
        super("ultradragons_ore_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockInit.DRAGON_CRYSTAL_ORE);
    }
}
