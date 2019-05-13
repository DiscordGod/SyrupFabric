package com.emhwebserver.syrup;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.module.ToggleUtil;
import com.emhwebserver.syrup.module.modules.Keys;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import javax.swing.text.JTextComponent;

public class SyrupClient implements ClientModInitializer {
  public static FabricKeyBinding sprint;
  public static FabricKeyBinding fullbright;
  public static FabricKeyBinding armorstatus;
  public static FabricKeyBinding coords;
  public static FabricKeyBinding keys;

  public void onInitializeClient() {
    KeyBindingRegistry.INSTANCE.addCategory("Syrup");
    sprint = FabricKeyBinding.Builder.create(new Identifier("syrup", "sprint"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_B, "Syrup").build();
    fullbright = FabricKeyBinding.Builder.create(new Identifier("syrup", "fullbright"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, "Syrup").build();
    armorstatus = FabricKeyBinding.Builder.create(new Identifier("syrup", "armorstatus"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_C, "Syrup").build();
    coords = FabricKeyBinding.Builder.create(new Identifier("syrup", "coords"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_X, "Syrup").build();
    keys = FabricKeyBinding.Builder.create(new Identifier("syrup", "keys"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_K, "Syrup").build();
    KeyBindingRegistry.INSTANCE.register(sprint);
    KeyBindingRegistry.INSTANCE.register(fullbright);
    KeyBindingRegistry.INSTANCE.register(armorstatus);
    KeyBindingRegistry.INSTANCE.register(coords);
    KeyBindingRegistry.INSTANCE.register(keys);
    System.out.println("Syrup Client Class Initialized");
  }
  
  public static void handleKeybinds() {
    if ((sprint == null) || (fullbright == null) || (armorstatus == null)) {
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
    while (coords.wasPressed()) {
      ToggleUtil.toggle(Event.moduleManager.coords);
    }
    while (keys.wasPressed()) {
      ToggleUtil.toggle(Event.moduleManager.keys);
    }
  }
}
