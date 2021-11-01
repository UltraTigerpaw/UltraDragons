package com.ultratigerpaw.ultradragons.objects.items.tools;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ToolShovel extends ItemSpade implements IHasModel {
    public ToolShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
