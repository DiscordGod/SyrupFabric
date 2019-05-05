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
    fullbright = new Fullbright();
    sprint = new com.emhwebserver.syrup.module.modules.Sprint();
    armorStatus = new ArmorStatus();
    moduleList.add(fullbright);
    moduleList.add(sprint);
    moduleList.add(armorStatus);
    armorStatus.setEnabled(true);
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
