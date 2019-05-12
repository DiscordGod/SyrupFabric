package com.emhwebserver.syrup;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.handler.GameOverlayHandler;
import com.emhwebserver.syrup.utils.Keybinds;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

@Mod(modid = SyrupMod.MODID, name = SyrupMod.NAME, version = SyrupMod.VERSION)
public class SyrupMod
{
    public static final String MODID = "syrup";
    public static final String NAME = "Syrup";
    public static final String VERSION = "1.13";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.syrup.json");
        Keybinds.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Event.init();
        MinecraftForge.EVENT_BUS.register(new GameOverlayHandler());
    }

}