package com.ultratigerpaw.ultradragons.objects.items.armor;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
public class DragonCrystalArmor extends ItemArmor implements IHasModel{
    public DragonCrystalArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_ARMOR);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
