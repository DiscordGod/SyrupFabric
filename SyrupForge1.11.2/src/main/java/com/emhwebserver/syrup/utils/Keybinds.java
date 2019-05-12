package com.emhwebserver.syrup.utils;


import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybinds {

    public static KeyBinding sprint;
    public static KeyBinding fullbright;
    public static KeyBinding armorstatus;

    public static void register() {
        sprint = new KeyBinding("key.syrup.sprint", Keyboard.KEY_B, "Syrup");
        fullbright = new KeyBinding("key.syrup.fullbright", Keyboard.KEY_V, "Syrup");
        armorstatus = new KeyBinding("key.syrup.armorstatus", Keyboard.KEY_C, "Syrup");

        ClientRegistry.registerKeyBinding(sprint);
        ClientRegistry.registerKeyBinding(fullbright);
        ClientRegistry.registerKeyBinding(armorstatus);
    }

}
