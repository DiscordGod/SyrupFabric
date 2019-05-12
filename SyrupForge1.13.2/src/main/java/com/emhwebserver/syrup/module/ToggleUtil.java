package com.emhwebserver.syrup.module;

public class ToggleUtil {

  public static int toggleTimer = 0;

  public static void toggle(Module module) {
    if(toggleTimer > 0) return;
    module.toggle();
    toggleTimer = 7;
  }

}
