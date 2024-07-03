package configs.appiumSettings;

import configs.configFileProperties.ConfigFileProperties;
import handleFilesAndPaths.handleConfigFile.GetPropertiesFromConfigFile;

public class DeviceSettings {
    public static String deviceName;
    public static String udid;

    public DeviceSettings(){
        deviceName = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.deviceName);
        udid = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.udid);
    }
}
