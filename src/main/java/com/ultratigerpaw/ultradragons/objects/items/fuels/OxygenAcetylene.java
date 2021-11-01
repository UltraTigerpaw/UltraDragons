package com.ultratigerpaw.ultradragons.objects.items.fuels;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OxygenAcetylene extends Item implements IHasModel {
    public OxygenAcetylene(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_FUELS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return 1000;
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
