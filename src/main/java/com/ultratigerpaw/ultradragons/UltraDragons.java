package com.ultratigerpaw.ultradragons;

import com.ultratigerpaw.ultradragons.proxy.CommonProxy;
import com.ultratigerpaw.ultradragons.tabs.*;
import com.ultratigerpaw.ultradragons.util.handlers.RegistryHandler;
import com.ultratigerpaw.ultradragons.world.gen.WorldGenOres;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = UltraDragons.MOD_ID, version = UltraDragons.VERSION, acceptedMinecraftVersions = UltraDragons.ACCEPTED_MC_VERSION, name = UltraDragons.NAME)
public class UltraDragons {

    @Mod.Instance
    public static UltraDragons instance;

    public static final String NAME = "UltraTigerpaw's UltraDragons Mod";
    public static final String MOD_ID = "ultradragons";
    public static final String VERSION = "0.0.0.1";
    public static final String ACCEPTED_MC_VERSION = "[1.12.2]";

    public static final int ENTITY_MONSTROUS_NIGHTMARE = 250;

    @SidedProxy(clientSide = "com.ultratigerpaw.ultradragons.proxy.ClientProxy", serverSide = "com.ultratigerpaw.ultradragons.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs ULTRADRAGONS_STANDARD_ITEMS = new UltraDragonsStandardItems("ultradragons_standard_items_tab");
    public static final CreativeTabs ULTRADRAGONS_STANDARD_BLOCKS = new UltraDragonsStandardBlocks("ultradragons_standard_blocks_tab");
    public static final CreativeTabs ULTRADRAGONS_FUELS = new UltraDragonsFuels("ultradragons_fuels_tab");
    public static final CreativeTabs ULTRADRAGONS_FOOD = new UltraDragonsFood("ultradragons_food_tab");
    public static final CreativeTabs ULTRADRAGONS_ORES = new UltraDragonsOre("ultradragons_ore_tab");
    public static final CreativeTabs ULTRADRAGONS_ARMOR = new UltraDragonsArmor("ultradragons_armor_tab");
    public static final CreativeTabs ULTRADRAGONS_TOOLS = new UltraDragonsTools("ultradragons_tools_tab");
    public static final CreativeTabs ULTRADRAGONS_STAFFS = new UltraDragonsStaffs("ultradragons_staffs_tab");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        RegistryHandler.postInitRegistries();
    }

    @Mod.EventHandler
    public void serverInit(FMLServerStartingEvent event){
        RegistryHandler.serverRegistries(event);
    }
}