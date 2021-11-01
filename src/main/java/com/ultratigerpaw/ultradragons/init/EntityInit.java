package com.ultratigerpaw.ultradragons.init;

import com.ultratigerpaw.ultradragons.UltraDragons;
import com.ultratigerpaw.ultradragons.entity.monstrous_nightmare.EntityMonstrousNightmare;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities(){
        registerEntity("monstrous_nightmare", EntityMonstrousNightmare.class, UltraDragons.ENTITY_MONSTROUS_NIGHTMARE, 54, 7028515, 1644051);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(UltraDragons.MOD_ID + ":" + name), entity, name, id, UltraDragons.instance, range, 1, true, color1, color2);
    }

    private static void registerNonMobEntity(){

    }
}
