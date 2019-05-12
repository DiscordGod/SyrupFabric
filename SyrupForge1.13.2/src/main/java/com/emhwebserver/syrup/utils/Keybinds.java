package com.emhwebserver.syrup.utils;


import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

public class Keybinds {

    public static KeyBinding sprint;
    public static KeyBinding fullbright;
    public static KeyBinding armorstatus;

    public static void register() {
        sprint = new KeyBinding("key.syrup.sprint", GLFW.GLFW_KEY_B, "Syrup");
        fullbright = new KeyBinding("key.syrup.fullbright",GLFW.GLFW_KEY_V, "Syrup");
        armorstatus = new KeyBinding("key.syrup.armorstatus", GLFW.GLFW_KEY_C, "Syrup");

        ClientRegistry.registerKeyBinding(sprint);
        ClientRegistry.registerKeyBinding(fullbright);
        ClientRegistry.registerKeyBinding(armorstatus);
    }

}
