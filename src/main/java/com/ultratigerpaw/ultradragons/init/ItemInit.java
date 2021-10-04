package com.ultratigerpaw.ultradragons.init;

import com.ultratigerpaw.ultradragons.objects.items.DragonCrystalShard;
import com.ultratigerpaw.ultradragons.objects.items.IonizedOxyacetylene;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item DRAGON_CRYSTAL_SHARD = new DragonCrystalShard("dragon_crystal_shard");
    public static final Item IONIZED_OXYACETYLENE = new IonizedOxyacetylene("ionized_oxyacetylene");
}
