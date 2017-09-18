package com.handlers;

public enum SettingsMenu {
    CONFIGURATIONS(0) {
        @Override
        public String getMenuName() {
            return null;
        }
    },
    TOURNAMENT(1) {
        @Override
        public String getMenuName() {
            return null;
        }
    },
    KYORUGUI(2) {
        @Override
        public String getMenuName() {
            return "kyorugui_configuration.fxml";
        }
    },
    POOMSAE(3) {
        @Override
        public String getMenuName() {
            return "poomsae_configuration.fxml";
        }
    },
    DEVICES(4) {
        @Override
        public String getMenuName() {
            return null;
        }
    },
    CONFIGURATION(5) {
        @Override
        public String getMenuName() {
            return "devices_configuration.fxml";
        }
    },
    SYNCHRONIZATION(6) {
        @Override
        public String getMenuName() {
            return "devices_synchronization.fxml";
        }
    };

    SettingsMenu(int val){

    }

    public static SettingsMenu getForValue(String value){
        for(SettingsMenu settingsMenu : SettingsMenu.values()){
            if(settingsMenu.name().equalsIgnoreCase(value))
                return settingsMenu;
        }
        return null;
    }

    public abstract String getMenuName();
}
