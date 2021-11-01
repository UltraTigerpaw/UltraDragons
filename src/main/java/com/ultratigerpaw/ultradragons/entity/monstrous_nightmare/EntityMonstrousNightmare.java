package com.ultratigerpaw.ultradragons.entity.monstrous_nightmare;

import com.ultratigerpaw.ultradragons.util.handlers.SoundsHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityMonstrousNightmare extends EntityTameable implements EntityFlying, IMob {

    private static final DataParameter<Boolean> ATTACKING = EntityDataManager.<Boolean>createKey(EntityMonstrousNightmare.class, DataSerializers.BOOLEAN);
    private int explosionStrength = 2;

    public EntityMonstrousNightmare(World worldIn) {
        super(worldIn);
        this.setSize(width, height);
        this.isImmuneToFire = true;
        this.experienceValue = 22;
    }

    @Override
    protected void initEntityAI() {
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySheep.class, true));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityChicken.class, true));
        this.tasks.addTask(6, new EntityAIAttackMelee(this, 1.0D, true));
        this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.tasks.addTask(8, new EntityAIWanderAvoidWater(this, 1.0D, 0.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(10, new EntityAIWander(this, 3.0D));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(11.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(54.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(5.0D);
    }

    @Override
    protected boolean canBeRidden(Entity entityIn) {
        return super.canBeRidden(entityIn);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsHandler.MONSTROUS_NIGHTMARE_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundsHandler.MONSTROUS_NIGHTMARE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsHandler.MONSTROUS_NIGHTMARE_DEATH;
    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        this.setSize(0.5F, 0.5F);
        return new EntityMonstrousNightmare(this.world);
    }
}