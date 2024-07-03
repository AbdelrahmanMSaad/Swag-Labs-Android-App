package configs.appiumSettings;

import configs.configFileProperties.ConfigFileProperties;
import handleFilesAndPaths.handleConfigFile.GetPropertiesFromConfigFile;


public class PlatformSettings {
    public static String androidPlatformName;
    public static String androidVersion;

    public PlatformSettings(){
        androidPlatformName = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.androidPlatformName);
        androidVersion = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.androidVersion);
    }
}
