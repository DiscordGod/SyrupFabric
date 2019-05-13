package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;

public class Fullbright extends Module {
  public Fullbright()
  {
    super("Fullbright", Category.RENDER, "V");
  }
  
  public void onEnable() {
    mc.options.gamma = 16;
    SyrupMod.CONFIG.get().getGeneral().setFullbrightToggled(true);
  }
  
  public void onDisable() {
    mc.options.gamma = 1;
    SyrupMod.CONFIG.get().getGeneral().setFullbrightToggled(true);
  }
}
