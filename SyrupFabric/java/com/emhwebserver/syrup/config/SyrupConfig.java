package com.emhwebserver.syrup.config;

public class SyrupConfig {

    private final ConfigGeneral general = new ConfigGeneral();

    public ConfigGeneral getGeneral() {
        return general;
    }

    public static class ConfigGeneral {
        private boolean armorStatusToggled = true;
        private boolean coordsToggled = true;
        private boolean fullbrightToggled = false;
        private boolean keysToggled = true;
        private boolean sprintToggled = false;

        public boolean isArmorStatusToggled() {
            return armorStatusToggled;
        }

        public void setArmorStatusToggled(boolean armorStatusToggled) {
            this.armorStatusToggled = armorStatusToggled;
        }

        public boolean isCoordsToggled() {
            return coordsToggled;
        }

        public void setCoordsToggled(boolean coordsToggled) {
            this.coordsToggled = coordsToggled;
        }

        public boolean isFullbrightToggled() {
            return fullbrightToggled;
        }

        public void setFullbrightToggled(boolean fullbrightToggled) {
            this.fullbrightToggled = fullbrightToggled;
        }

        public boolean isKeysToggled() {
            return keysToggled;
        }

        public void setKeysToggled(boolean keysToggled) {
            this.keysToggled = keysToggled;
        }

        public boolean isSprintToggled() {
            return sprintToggled;
        }

        public void setSprintToggled(boolean sprintToggled) {
            this.sprintToggled = sprintToggled;
        }
    }

}
