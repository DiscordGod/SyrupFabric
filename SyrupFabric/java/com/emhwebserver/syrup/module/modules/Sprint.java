package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;

public class Sprint extends Module
{
  public Sprint()
  {
    super("Sprint", Category.MOVEMENT);
  }
  
  public void playerTick() {
    if(mc.player.getHungerManager().getFoodLevel() > 6.0F) {
      mc.player.setSprinting(true);
    }
  }

  public void onEnable() {
    SyrupMod.CONFIG.get().getGeneral().setSprintToggled(true);
  }
  
  public void onDisable() {
    if(mc.world != null) {
      mc.player.setSprinting(false);
    }
    SyrupMod.CONFIG.get().getGeneral().setSprintToggled(false);
  }
}
