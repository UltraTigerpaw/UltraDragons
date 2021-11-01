package com.ultratigerpaw.ultradragons.init;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.objects.items.armor.DragonCrystalArmor;
import com.ultratigerpaw.ultradragons.objects.items.food.Almonds;
import com.ultratigerpaw.ultradragons.objects.items.food.potionEffects.GrilledChickenDrumstick;
import com.ultratigerpaw.ultradragons.objects.items.fuels.OxygenAcetylene;
import com.ultratigerpaw.ultradragons.objects.items.staffs.StandardLightningStaff;
import com.ultratigerpaw.ultradragons.objects.items.standard.DragonCrystal;
import com.ultratigerpaw.ultradragons.objects.items.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final ItemArmor.ArmorMaterial ARMOR_DRAGON_CRYSTAL = EnumHelper.addArmorMaterial("armor_dragon_crystal", UltraDragons.MOD_ID + ":dragon_crystal", 800, new int[] {4, 7, 9, 5}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
    public static final Item.ToolMaterial TOOL_DRAGON_CRYSTAL = EnumHelper.addToolMaterial("tool_dragon_crystal", 4, 2000, 10.0F, 20.0F, 20);

    public static final Item DRAGON_CRYSTAL = new DragonCrystal("dragon_crystal");

    public static final Item OXYGEN_ACETYLENE = new OxygenAcetylene("oxygen_acetylene");

    public static final Item ALMONDS = new Almonds("almonds", 1, 1.0F, false);

    public static final Item GRILLED_CHICKEN_DRUMSTICK = new GrilledChickenDrumstick("grilled_chicken_drumstick", 10, 1.0F, false);

    public static final Item STANDARD_LIGHTNING_STAFF = new StandardLightningStaff("standard_lightning_staff");
    
    public static final Item HELMET_DRAGON_CRYSTAL = new DragonCrystalArmor("helmet_dragon_crystal", ARMOR_DRAGON_CRYSTAL, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_DRAGON_CRYSTAL = new DragonCrystalArmor("chestplate_dragon_crystal", ARMOR_DRAGON_CRYSTAL, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_DRAGON_CRYSTAL = new DragonCrystalArmor("leggings_dragon_crystal", ARMOR_DRAGON_CRYSTAL, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_DRAGON_CRYSTAL = new DragonCrystalArmor("boots_dragon_crystal", ARMOR_DRAGON_CRYSTAL, 1, EntityEquipmentSlot.FEET);

    public static final Item AXE_DRAGON_CRYSTAL = new ToolAxe("dragon_crystal_axe", TOOL_DRAGON_CRYSTAL);
    public static final Item PICKAXE_DRAGON_CRYSTAL = new ToolPickaxe("dragon_crystal_pickaxe", TOOL_DRAGON_CRYSTAL);
    public static final Item SWORD_DRAGON_CRYSTAL = new ToolSword("dragon_crystal_sword", TOOL_DRAGON_CRYSTAL);
    public static final Item HOE_DRAGON_CRYSTAL = new ToolHoe("dragon_crystal_hoe", TOOL_DRAGON_CRYSTAL);
    public static final Item SHOVEL_DRAGON_CRYSTAL = new ToolShovel("dragon_crystal_shovel", TOOL_DRAGON_CRYSTAL);
}
