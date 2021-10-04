package com.ultratigerpaw.ultradragons;

import com.ultratigerpaw.ultradragons.proxy.ClientProxy;
import com.ultratigerpaw.ultradragons.tabs.UltraDragonsTab;
import com.ultratigerpaw.ultradragons.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class UltraDragons {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static ClientProxy proxy;

    public static final CreativeTabs ULTRADRAGONSTAB = new UltraDragonsTab("ultradragonstab");
	
	@Mod.Instance
    public static UltraDragons instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
