package com.ultratigerpaw.ultradragons.objects.items.staffs;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.entity.lightning_ball.EntityLightningBall;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class StandardLightningStaff extends Item implements IHasModel {
    public StandardLightningStaff(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(UltraDragons.ULTRADRAGONS_STAFFS);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d look = playerIn.getLookVec();
        EntityLightningBall lightningBall = new EntityLightningBall(worldIn, 1D, 1D, 1D);
        lightningBall.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);
        lightningBall.motionX = look.x * 3.00;
        lightningBall.motionY = look.y * 3.00;
        lightningBall.motionZ = look.z * 3.00;
        lightningBall.setGlowing(false);
        playerIn.getCooldownTracker().setCooldown(this, 1);
        worldIn.spawnEntity(lightningBall);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

    @Override
    public void registerModels() {
        UltraDragons.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
