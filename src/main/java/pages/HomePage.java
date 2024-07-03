package pages;

import automatedActions.AutomatedActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver<MobileElement> androidDriver;
    private AutomatedActions automatedActions;

    public HomePage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver = androidDriver;
        this.automatedActions = new AutomatedActions(this.androidDriver);
    }

    private final By appLogoXpath = MobileBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");

    public boolean isHomePageAppLogoDisplayed(){
        MobileElement appLogo = this.automatedActions.waitActions().waitForAnElementToBeVisible(appLogoXpath);
        return this.automatedActions.displayActions().isElementDisplayed(appLogo);
    }


}
