package com.ultratigerpaw.ultradragons.objects.items;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IonizedOxyacetylene extends Item implements IHasModel {

    public IonizedOxyacetylene(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONSTAB);

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
