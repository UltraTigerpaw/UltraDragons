package com.ultratigerpaw.ultradragons;

import com.ultratigerpaw.ultradragons.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = UltraDragons.MODID, name = UltraDragons.MODNAME, version = UltraDragons.MODVERSION, dependencies = "required-after:forge@[14.23.5.2855,)", useMetadata = true)
public class UltraDragons {

    public static final String MODID = "ultradragons";
    public static final String MODNAME = "UltraTigerpaw's UltraDragons Mod";
    public static final String MODVERSION= "0.0.0.1";

    @SidedProxy(clientSide = "com.ultratigerpaw.ultradragons.client.ClientProxy", serverSide = "com.ultratigerpaw.ultradragons.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static UltraDragons instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent e){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){

    }
}