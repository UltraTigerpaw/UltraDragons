package com.ultratigerpaw.ultradragons.init;


import com.ultratigerpaw.ultradragons.objects.blocks.DragonCrystalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DRAGON_CRYSTAL_BLOCK = new DragonCrystalBlock("dragon_crystal_block", Material.REDSTONE_LIGHT);
}
