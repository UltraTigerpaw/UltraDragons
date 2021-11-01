package com.ultratigerpaw.ultradragons.objects.blocks.ore;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.BlockInit;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class DragonCrystalOre extends Block implements IHasModel {

    public DragonCrystalOre(String name, Material material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_ORES);
        setHardness(50.0F);
        setResistance(45.0F);
        setLightLevel(1.0F);
        setLightOpacity(7);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

