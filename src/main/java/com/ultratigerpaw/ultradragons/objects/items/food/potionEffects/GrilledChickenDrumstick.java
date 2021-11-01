package com.ultratigerpaw.ultradragons.objects.items.food.potionEffects;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GrilledChickenDrumstick extends ItemFood implements IHasModel {

    public GrilledChickenDrumstick(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_FOOD);
        setAlwaysEdible();

        ItemInit.ITEMS.add(this);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        entityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 300, 1, false, false));
        entityLiving.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 420, 2, false, false));
        return super .onItemUseFinish(stack, worldIn, entityLiving);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
