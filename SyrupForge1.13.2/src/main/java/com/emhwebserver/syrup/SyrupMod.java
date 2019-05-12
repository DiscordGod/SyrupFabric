package com.emhwebserver.syrup;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.handler.GameOverlayHandler;
import com.emhwebserver.syrup.handler.TickHandler;
import com.emhwebserver.syrup.utils.Keybinds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("syrup")
public class SyrupMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SyrupMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new GameOverlayHandler());
        MinecraftForge.EVENT_BUS.register(new TickHandler());
    }

    private void setup(final FMLCommonSetupEvent event) {
        Event.init();
        Keybinds.register();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
}
