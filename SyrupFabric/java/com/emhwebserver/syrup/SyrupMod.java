package com.emhwebserver.syrup;

import com.emhwebserver.syrup.config.JsonConfig;
import com.emhwebserver.syrup.config.SyrupConfig;
import com.emhwebserver.syrup.event.Event;

import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.util.Identifier;

import java.io.File;

public class SyrupMod implements ModInitializer{

  public static final JsonConfig<SyrupConfig> CONFIG = new JsonConfig<>("syrup" + "/" + "syrup", SyrupConfig.class)
          .withGson(new GsonBuilder()
                  .setPrettyPrinting()
                  .registerTypeAdapter(Identifier.class, new Identifier.Serializer())
                  .create()
          );

  public void onInitialize() {
    new File(FabricLoader.INSTANCE.getConfigDirectory(), "syrup").mkdir();
    SyrupMod.CONFIG.save();
    Event.init();
    Event.moduleManager.armorStatus.setEnabled(SyrupMod.CONFIG.get().getGeneral().isArmorStatusToggled());
    Event.moduleManager.sprint.setEnabled(SyrupMod.CONFIG.get().getGeneral().isCoordsToggled());
    Event.moduleManager.sprint.setEnabled(SyrupMod.CONFIG.get().getGeneral().isFullbrightToggled());
    Event.moduleManager.sprint.setEnabled(SyrupMod.CONFIG.get().getGeneral().isKeysToggled());
    Event.moduleManager.sprint.setEnabled(SyrupMod.CONFIG.get().getGeneral().isSprintToggled());
    System.out.println("Syrup Mod Class Initialized");
  }
}
