package com.ultratigerpaw.ultradragons.entity.monstrous_nightmare;

import com.ultratigerpaw.ultradragons.UltraDragons;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import javax.annotation.Nullable;

public class RenderMonstrousNightmare extends RenderLiving<EntityMonstrousNightmare> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(UltraDragons.MOD_ID + ":textures/entity/monstrous_nightmare/monstrous_nightmare.png");

    public RenderMonstrousNightmare(RenderManager manager) {
        super(manager, new ModelMonstrousNightmare(), 0.2F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityMonstrousNightmare entity) {
        return TEXTURE;
    }
}
