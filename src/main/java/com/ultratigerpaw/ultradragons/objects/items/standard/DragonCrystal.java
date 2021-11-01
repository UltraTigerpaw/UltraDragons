package com.ultratigerpaw.ultradragons.objects.items.standard;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class DragonCrystal extends Item implements IHasModel {

    public DragonCrystal(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_STANDARD_ITEMS);
        setMaxStackSize(32);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
