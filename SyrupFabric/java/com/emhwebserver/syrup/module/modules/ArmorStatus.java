package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;

public class ArmorStatus extends Module {
  public ArmorStatus() {
    super("Armor Status", Category.RENDER);
  }

  public void onEnable() {
    SyrupMod.CONFIG.get().getGeneral().setArmorStatusToggled(true);
  }

  public void onDisable() {
    SyrupMod.CONFIG.get().getGeneral().setArmorStatusToggled(false);
  }

}
