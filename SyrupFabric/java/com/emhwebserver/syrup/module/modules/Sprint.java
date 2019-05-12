package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.module.Module;

public class Sprint extends Module
{
  public Sprint()
  {
    super("Sprint", com.emhwebserver.syrup.module.Category.MOVEMENT);
  }
  
  public void playerTick()
  {
    mc.player.setSprinting(true);
  }
  
  public void onDisable()
  {
    mc.player.setSprinting(false);
  }
}
