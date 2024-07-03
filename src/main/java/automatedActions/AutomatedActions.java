package automatedActions;

import configs.configFileProperties.ConfigFileProperties;
import handleFilesAndPaths.handleConfigFile.GetPropertiesFromConfigFile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AutomatedActions {
    protected final AndroidDriver<MobileElement> androidDriver;
    private final Actions actions;
    private final WebDriverWait webDriverWait;
    private static long implicitWaitDuration;

    public AutomatedActions(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver = androidDriver;
        actions = new Actions(this.androidDriver);
        long elementWaitDuration = Long.parseLong(GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.elementWaitDuration));
        webDriverWait = new WebDriverWait(this.androidDriver, elementWaitDuration);
        implicitWaitDuration = Long.parseLong(GetPropertiesFromConfigFile.getPropertyFromConfigFile(ConfigFileProperties.implicitWaitDuration));
    }

    public ClickingActions clickingActions() {
        return new ClickingActions();
    }

    public TextActions textActions() {
        return new TextActions();
    }

    public WaitActions waitActions() {
        return new WaitActions();
    }

    public DisplayActions displayActions() {
        return new DisplayActions();
    }

    public class ClickingActions {
        public void clickOnElement(MobileElement mobileElement) {
            mobileElement.click();
        }

        public void doubleTabOnElement(MobileElement mobileElement) {
            actions.doubleClick(mobileElement);
        }
    }

    public static class TextActions {
        public String getTextFromElement(MobileElement mobileElement) {
            return mobileElement.getText();
        }

        public void sendTextToElement(MobileElement mobileElement, String text) {
            mobileElement.sendKeys(text);
        }
    }

    public class WaitActions {
        public void setImplicitWait() {
            androidDriver.manage().timeouts().implicitlyWait(implicitWaitDuration, TimeUnit.SECONDS);
        }

        public MobileElement waitForAnElementToBeClickable(MobileBy mobileBy) {
            return (MobileElement) webDriverWait.until(ExpectedConditions.elementToBeClickable(mobileBy));

        }

        public MobileElement waitForAnElementToBeVisible(By mobileBy) {
            return (MobileElement) webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(mobileBy));
        }
    }

    public static class DisplayActions {
        public boolean isElementDisplayed(MobileElement mobileElement) {
            return mobileElement.isDisplayed();
        }

        public boolean isElementSelected(MobileElement mobileElement) {
            return mobileElement.isSelected();
        }

        public boolean isElementEnabled(MobileElement mobileElement) {
            return mobileElement.isEnabled();
        }
    }

}
