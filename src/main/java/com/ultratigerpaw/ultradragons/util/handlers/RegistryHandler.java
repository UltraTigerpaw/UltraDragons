package com.ultratigerpaw.ultradragons.util.handlers;

import com.ultratigerpaw.ultradragons.init.BlockInit;
import com.ultratigerpaw.ultradragons.init.EntityInit;
import com.ultratigerpaw.ultradragons.init.ItemInit;
import com.ultratigerpaw.ultradragons.util.interfaces.IHasModel;
import com.ultratigerpaw.ultradragons.world.gen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    public static void preInitRegistries()
    {
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 4);
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        SoundsHandler.registerSounds();
    }

    public static void initRegistries()
    {

    }

    public static void postInitRegistries()
    {

    }

    public static void serverRegistries(FMLServerStartingEvent event)
    {

    }
}
