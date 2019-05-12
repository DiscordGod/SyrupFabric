package com.emhwebserver.syrup.handler;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.module.ToggleUtil;
import com.emhwebserver.syrup.utils.Keybinds;

public class KeyHandler {

    public static void onTick() {
        if(Keybinds.sprint.isPressed()) {
            ToggleUtil.toggle(Event.moduleManager.sprint);
        } else if(Keybinds.fullbright.isPressed()) {
            ToggleUtil.toggle(Event.moduleManager.fullbright);
        } else if(Keybinds.armorstatus.isPressed()) {
            ToggleUtil.toggle(Event.moduleManager.armorStatus);
        }
    }

}
