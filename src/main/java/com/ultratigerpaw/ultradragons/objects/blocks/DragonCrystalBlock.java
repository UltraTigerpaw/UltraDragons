package com.ultratigerpaw.ultradragons.objects.blocks;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.BlockInit;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class DragonCrystalBlock extends Block implements IHasModel {

    public DragonCrystalBlock(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONSTAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
