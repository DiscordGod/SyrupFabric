package com.emhwebserver.syrup.module.modules;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.module.Category;
import com.emhwebserver.syrup.module.Module;

public class Coords extends Module {

    public Coords() {
        super("Coords", Category.RENDER);
    }

    public void onEnable() {
        SyrupMod.CONFIG.get().getGeneral().setCoordsToggled(true);
    }

    public void onDisable() {
        SyrupMod.CONFIG.get().getGeneral().setCoordsToggled(false);
    }

}
