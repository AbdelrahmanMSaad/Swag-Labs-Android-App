package base;
import automatedActions.AutomatedActions;
import configs.appiumSettings.AppiumSettings;
import handleCapabilities.HandleCapabilities;
import initializers.InitializeConfigs;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;

public class Base {
    protected AndroidDriver<MobileElement> androidDriver;
    private AutomatedActions automatedActions;

    /**
     * This method is to open the application with the configs from the config file
     * @return Login Page Object
     */
    public LoginPage openApplication(){
        InitializeConfigs.initializeAllSettings();
        this.androidDriver = new AndroidDriver<MobileElement>(AppiumSettings.appiumUrl,HandleCapabilities.getDesiredCapabilities());
        this.automatedActions = new AutomatedActions(this.androidDriver);
        this.automatedActions.waitActions().setImplicitWait();
        return new LoginPage(this.androidDriver);

    }

    public static void main(String[] args) {
        Base base = new Base();
        LoginPage loginPage = base.openApplication();
        loginPage.sendTextToUserNameInput("text");
    }
}
