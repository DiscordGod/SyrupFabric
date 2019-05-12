package com.emhwebserver.syrup.handlers;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.module.ToggleUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class KeyHandler{

    public void onTick() {
        if(GLFW.glfwGetKey(Minecraft.getInstance().mainWindow.getHandle(), GLFW.GLFW_KEY_B) == GLFW.GLFW_PRESS) {
            ToggleUtil.toggle(Event.moduleManager.sprint);
        }else if(GLFW.glfwGetKey(Minecraft.getInstance().mainWindow.getHandle(), GLFW.GLFW_KEY_V) == GLFW.GLFW_PRESS) {
            ToggleUtil.toggle(Event.moduleManager.fullbright);
        }else if(GLFW.glfwGetKey(Minecraft.getInstance().mainWindow.getHandle(), GLFW.GLFW_KEY_C) == GLFW.GLFW_PRESS) {
            ToggleUtil.toggle(Event.moduleManager.armorStatus);
        }
    }

}
