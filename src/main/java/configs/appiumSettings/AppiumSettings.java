package configs.appiumSettings;

import configs.configFileProperties.ConfigFileProperties;
import handleFilesAndPaths.handleConfigFile.GetPropertiesFromConfigFile;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSettings {
    public static String automationName;

    public static URL appiumUrl;

    public AppiumSettings(){
        automationName = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.automationName);
        String url = GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.url);
        try {
            appiumUrl = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
