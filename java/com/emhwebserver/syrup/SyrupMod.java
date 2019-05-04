package com.emhwebserver.syrup;

import com.emhwebserver.syrup.event.Event;
import java.io.PrintStream;
import net.fabricmc.api.ModInitializer;

public class SyrupMod implements ModInitializer {
  public static double version = 1.11;
  
  public void onInitialize() {
    System.out.println("Syrup Mod Class Initialized");
    Event.init();
  }
}
