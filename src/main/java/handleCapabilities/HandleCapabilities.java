package handleCapabilities;

import configs.AppiumCapabilities.AppiumCapabilities;
import configs.appPackageAndActivities.AppPackageAndActivities;
import configs.appiumSettings.AppiumSettings;
import configs.appiumSettings.DeviceSettings;
import configs.appiumSettings.PlatformSettings;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleCapabilities {

    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(AppiumCapabilities.appPackage, AppPackageAndActivities.appPackage);
        desiredCapabilities.setCapability(AppiumCapabilities.appActivity, AppPackageAndActivities.splashActivity);

        desiredCapabilities.setCapability(AppiumCapabilities.automationName, AppiumSettings.automationName);

        desiredCapabilities.setCapability(AppiumCapabilities.deviceName, DeviceSettings.deviceName);
        desiredCapabilities.setCapability(AppiumCapabilities.udid, DeviceSettings.udid);

        desiredCapabilities.setCapability(AppiumCapabilities.platformName, PlatformSettings.androidPlatformName);
        desiredCapabilities.setCapability(AppiumCapabilities.platformVersion, PlatformSettings.androidVersion);

        return desiredCapabilities;
    }
}
