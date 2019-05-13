package com.emhwebserver.syrup.module;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.modules.*;

import java.util.ArrayList;

public class ModuleManager {
  public ArrayList<Module> moduleList = new ArrayList();
  public Fullbright fullbright;
  public Sprint sprint;
  public ArmorStatus armorStatus;
  public Keys keys;
  public Coords coords;
  
  public void init() {
    fullbright = new Fullbright();
    sprint = new Sprint();
    armorStatus = new ArmorStatus();
    keys = new Keys();
    coords = new Coords();
    moduleList.add(fullbright);
    moduleList.add(sprint);
    moduleList.add(armorStatus);
    moduleList.add(keys);
    moduleList.add(coords);
  }
  
  public ArrayList<Module> getEnabledModules() {
    ArrayList<Module> toggledModules = new ArrayList();
    for (Module module : moduleList) {
      if (module.isEnabled())
        toggledModules.add(module);
    }
    return toggledModules;
  }
  
  public ArrayList<Module> getDisabledModules() {
    ArrayList<Module> unToggledModules = new ArrayList();
    for (Module module : moduleList) {
      if (!module.isEnabled())
        unToggledModules.add(module);
    }
    return unToggledModules;
  }
}
