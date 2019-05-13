package com.emhwebserver.syrup.module;

import net.minecraft.client.MinecraftClient;

public class Module {
  public String name;
  private Category category;
  public String description;
  boolean enabled;
  protected static MinecraftClient mc = MinecraftClient.getInstance();
  
  public Module(String name, Category category) {
    this(name, category, null);
  }
  
  public Module(String name, Category category, String description) {
    this.name = name;
    this.category = category;
    this.description = description;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    if (enabled) {
      this.onEnable();
    }
    if (!enabled) {
      this.onDisable();
    }
  }
  

  public void onEnable() {}
  

  public void onDisable() {}
  

  public void clientTick() {}
  
  public void playerTick() {}
  
  public void toggle()
  {
    setEnabled(!isEnabled());
  }
}
