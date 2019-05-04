package com.emhwebserver.syrup;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.module.ToggleUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;

public class SyrupClient implements ClientModInitializer {
  public static FabricKeyBinding sprint;
  public static FabricKeyBinding fullbright;
  public static FabricKeyBinding armorstatus;
  
  public void onInitializeClient()
  {
    KeyBindingRegistry.INSTANCE.addCategory("Syrup");
    sprint = FabricKeyBinding.Builder.create(new Identifier("syrup", "sprint"), InputUtil.Type.KEYSYM, 66, "Syrup").build();
    fullbright = FabricKeyBinding.Builder.create(new Identifier("syrup", "fullbright"), InputUtil.Type.KEYSYM, 86, "Syrup").build();
    armorstatus = FabricKeyBinding.Builder.create(new Identifier("syrup", "armorstatus"), InputUtil.Type.KEYSYM, 67, "Syrup").build();
    KeyBindingRegistry.INSTANCE.register(sprint);
    KeyBindingRegistry.INSTANCE.register(fullbright);
    KeyBindingRegistry.INSTANCE.register(armorstatus);
    System.out.println("Syrup Client Class Initialized");
  }
  
  public static void handleKeybinds() {
    if ((sprint == null) || (fullbright == null)) {
      return;
    }
    while (sprint.wasPressed()) {
      ToggleUtil.toggle(Event.moduleManager.sprint);
    }
    while (fullbright.wasPressed()) {
      ToggleUtil.toggle(Event.moduleManager.fullbright);
    }
    while (armorstatus.wasPressed()) {
      ToggleUtil.toggle(Event.moduleManager.armorStatus);
    }
  }
}
