package com.emhwebserver.syrup.module;

import com.emhwebserver.syrup.module.modules.ArmorStatus;
import com.emhwebserver.syrup.module.modules.Fullbright;
import java.util.ArrayList;

public class ModuleManager {
  public ArrayList<Module> moduleList = new ArrayList();
  public Fullbright fullbright;
  public com.emhwebserver.syrup.module.modules.Sprint sprint;
  public ArmorStatus armorStatus;
  
  public void init() {
    this.fullbright = new Fullbright();
    this.sprint = new com.emhwebserver.syrup.module.modules.Sprint();
    this.armorStatus = new ArmorStatus();
    this.moduleList.add(this.fullbright);
    this.moduleList.add(this.sprint);
    this.moduleList.add(this.armorStatus);
  }
  
  public ArrayList<Module> getEnabledModules() {
    ArrayList<Module> toggledModules = new ArrayList();
    for (Module module : this.moduleList) {
      if (module.isEnabled())
        toggledModules.add(module);
    }
    return toggledModules;
  }
  
  public ArrayList<Module> getDisabledModules() {
    ArrayList<Module> unToggledModules = new ArrayList();
    for (Module module : this.moduleList) {
      if (!module.isEnabled())
        unToggledModules.add(module);
    }
    return unToggledModules;
  }
}
