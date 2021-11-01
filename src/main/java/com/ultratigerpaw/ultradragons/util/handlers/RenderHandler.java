package com.ultratigerpaw.ultradragons.util.handlers;

import com.ultratigerpaw.ultradragons.entity.monstrous_nightmare.EntityMonstrousNightmare;
import com.ultratigerpaw.ultradragons.entity.monstrous_nightmare.RenderMonstrousNightmare;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMonstrousNightmare.class, new IRenderFactory<EntityMonstrousNightmare>() {
            @Override
            public Render<? super EntityMonstrousNightmare> createRenderFor(RenderManager manager) {
                return new RenderMonstrousNightmare(manager);
            }
        });
    }
}
