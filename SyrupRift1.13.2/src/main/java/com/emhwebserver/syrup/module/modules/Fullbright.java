package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;

public class Fullbright extends Module {
  public Fullbright()
  {
    super("Fullbright", Category.RENDER, "V");
  }
  
  public void onEnable() {
    mc.gameSettings.gammaSetting = 16;
  }
  
  public void onDisable() {
    mc.gameSettings.gammaSetting = 1;
  }
}
