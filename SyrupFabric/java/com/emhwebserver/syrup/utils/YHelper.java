package com.emhwebserver.syrup.utils;

import com.emhwebserver.syrup.event.Event;

public class YHelper {

    public static float y (String render) {
        switch (render) {
            case "fps":
                return 1;
            case "xyz":
                return 15;
            case "keysW":
                if (Event.moduleManager.coords.isEnabled()) {
                    return 16 - 3;
                } else {
                    return 9 - 3;
                }
            case "keysA":
                if (Event.moduleManager.coords.isEnabled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "keysS":
                if (Event.moduleManager.coords.isEnabled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "keysD":
                if (Event.moduleManager.coords.isEnabled()) {
                    return 27 - 3;
                } else {
                    return 20 - 3;
                }
            case "sprintorcps":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 75 - 4;
                    } else {
                        return 45 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 60 - 4;
                    } else {
                        return 30 - 15;
                    }
                }
            case "swinging":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 90 - 5;
                    } else {
                        return 60 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 75 - 5;
                    } else {
                        return 45 - 15;
                    }
                }
            case "armorHelm":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 105 - 5;
                    } else {
                        return 75 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 90 - 5;
                    } else {
                        return 60 - 15;
                    }
                }
            case "armorChest":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 120 - 5;
                    } else {
                        return 90 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 105 - 5;
                    } else {
                        return 75 - 15;
                    }
                }
            case "armorLeggings":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 135 - 5;
                    } else {
                        return 105 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 120 - 5;
                    } else {
                        return 90 - 15;
                    }
                }
            case "armorBoots":
                if (Event.moduleManager.coords.isEnabled()) {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 150 - 5;
                    } else {
                        return 120 - 15;
                    }
                } else {
                    if (Event.moduleManager.keys.isEnabled()) {
                        return 135 - 5;
                    } else {
                        return 105 - 15;
                    }
                }
        }
        return 0;
    }

}