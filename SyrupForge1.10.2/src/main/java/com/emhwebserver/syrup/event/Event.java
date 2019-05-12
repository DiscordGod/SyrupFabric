package com.emhwebserver.syrup.event;

import com.emhwebserver.syrup.module.Module;
import com.emhwebserver.syrup.module.ModuleManager;
import com.emhwebserver.syrup.module.ToggleUtil;
import com.emhwebserver.syrup.ui.UIRenderer;
import net.minecraft.client.Minecraft;

public class Event
{
  public static ModuleManager moduleManager;
  public static UIRenderer uiRenderer;
  
  public static void init() {
    moduleManager = new ModuleManager();
    uiRenderer = new UIRenderer();
    moduleManager.init();
  }
  
  public static void clientTick() {
    for (Module module : moduleManager.getEnabledModules()) {
      if (Minecraft.getMinecraft().thePlayer != null) {
        module.playerTick();
      }
      module.clientTick();
    }
    if(ToggleUtil.toggleTimer != 0) ToggleUtil.toggleTimer--;
  }
}
