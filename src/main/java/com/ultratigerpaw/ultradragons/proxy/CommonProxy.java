package com.ultratigerpaw.ultradragons.proxy;

import com.ultratigerpaw.ultradragons.UltraDragons;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    }

    public InputStream getStreamForResourceLocation(ResourceLocation resourceLocation) {
        return new BufferedInputStream(UltraDragons.class.getResourceAsStream("/assets/" + resourceLocation.getResourceDomain() + "/" + resourceLocation.getResourcePath()));
    }

    public void registerItemRenderer(Item item, int meta, String id)
    {
    }
}
