package initializers;

import configs.appiumSettings.AppiumSettings;
import configs.appiumSettings.DeviceSettings;
import configs.appiumSettings.PlatformSettings;

public class InitializeConfigs {
    private static void initializeAppiumSettings(){
        new AppiumSettings();
    }

    private static void initializeDeviceSettings(){
        new DeviceSettings();
    }

    private static void initializePlatformSettings(){
        new PlatformSettings();
    }

    public static void initializeAllSettings(){
        initializeAppiumSettings();
        initializeDeviceSettings();
        initializePlatformSettings();
    }
}
