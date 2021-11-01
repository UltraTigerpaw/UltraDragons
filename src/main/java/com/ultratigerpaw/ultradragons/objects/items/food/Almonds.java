package com.ultratigerpaw.ultradragons.objects.items.food;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class Almonds extends ItemFood implements IHasModel {
    public Almonds(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_FOOD);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
