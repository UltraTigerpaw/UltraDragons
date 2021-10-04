package com.ultratigerpaw.ultradragons.objects.items;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class DragonCrystalShard extends Item implements IHasModel {
    public DragonCrystalShard(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONSTAB);
        setMaxStackSize(32);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
		UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
