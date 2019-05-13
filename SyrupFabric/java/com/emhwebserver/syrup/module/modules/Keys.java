package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;
import com.emhwebserver.syrup.utils.YHelper;

public class Keys extends Module {
  public Keys() {
    super("Keys", Category.RENDER);
  }

  public void onEnable() {
    SyrupMod.CONFIG.get().getGeneral().setKeysToggled(true);
  }

  public void onDisable() {
    SyrupMod.CONFIG.get().getGeneral().setKeysToggled(false);
  }

}
