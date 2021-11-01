package com.ultratigerpaw.ultradragons.util.handlers;

import com.ultratigerpaw.ultradragons.UltraDragons;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
    public static SoundEvent MONSTROUS_NIGHTMARE_AMBIENT;
    public static SoundEvent MONSTROUS_NIGHTMARE_HURT;
    public static SoundEvent MONSTROUS_NIGHTMARE_DEATH;

    public static void registerSounds()
    {
        MONSTROUS_NIGHTMARE_AMBIENT = registerSound("entity.monstrous_nightmare.monstrous_nightmare_ambient");
        MONSTROUS_NIGHTMARE_HURT = registerSound("entity.monstrous_nightmare.monstrous_nightmare_hurt");
        MONSTROUS_NIGHTMARE_DEATH = registerSound("entity.monstrous_nightmare.monstrous_nightmare_death");
    }

    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(UltraDragons.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
