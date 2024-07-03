package pages;

import automatedActions.AutomatedActions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private AndroidDriver<MobileElement> androidDriver;
    private AutomatedActions automatedActions;

    public LoginPage(AndroidDriver<MobileElement> androidDriver) {
        this.androidDriver = androidDriver;
        this.automatedActions = new AutomatedActions(this.androidDriver);
    }

    private final By appLogoXpath = MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]");
    private final By usenNameInputFieldAccessibilityId = MobileBy.AccessibilityId("test-Username");
    private final By passwordInputFieldAccessibilityId = MobileBy.AccessibilityId("test-Password");
    private final By loginButtonAccessibilityId = MobileBy.AccessibilityId("test-LOGIN");
    private final By userNameRequiredErrorMessageXpath = MobileBy.xpath("//android.widget.TextView[@text=\"Username is required\"]");
    private final By passwordRequiredErrorMessageXpath = MobileBy.xpath("//android.widget.TextView[@text=\"Password is required\"]");
    private final By wrongCredentialsErrorMessageXpath = MobileBy.xpath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]");

    public boolean isAppLogoDisplayed() {
        MobileElement appLogo = this.automatedActions.waitActions().waitForAnElementToBeVisible(appLogoXpath);
        return this.automatedActions.displayActions().isElementDisplayed(appLogo);
    }

    public void sendTextToUserNameInput(String userName) {
        MobileElement userNameInputField = this.automatedActions.waitActions().waitForAnElementToBeVisible(usenNameInputFieldAccessibilityId);
        this.automatedActions.textActions().sendTextToElement(userNameInputField, userName);
    }

    public void sendTextToPasswordInputField(String password) {
        MobileElement passwordInputField = this.automatedActions.waitActions().waitForAnElementToBeVisible(passwordInputFieldAccessibilityId);
        this.automatedActions.textActions().sendTextToElement(passwordInputField,password);
    }

    public HomePage clickOnLoginButtonValidCredentials() {
        MobileElement loginButton = this.automatedActions.waitActions().waitForAnElementToBeVisible(loginButtonAccessibilityId);
        this.automatedActions.clickingActions().clickOnElement(loginButton);
        return new HomePage(this.androidDriver);
    }

    public void clickOnLoginButtonInvalidCredentials() {
        MobileElement loginButton = this.automatedActions.waitActions().waitForAnElementToBeVisible(loginButtonAccessibilityId);
        this.automatedActions.clickingActions().clickOnElement(loginButton);
    }

    public boolean isUserNameRequiredErrorMessageDisplayed(){
        MobileElement userNameRequiredErrorMessage = this.automatedActions.waitActions().waitForAnElementToBeVisible(userNameRequiredErrorMessageXpath);
        return this.automatedActions.displayActions().isElementDisplayed(userNameRequiredErrorMessage);
    }

    public boolean isPasswordRequiredErrorMessageDisplayed(){
        MobileElement passwordRequiredErrorMessage = this.automatedActions.waitActions().waitForAnElementToBeVisible(passwordRequiredErrorMessageXpath);
        return this.automatedActions.displayActions().isElementDisplayed(passwordRequiredErrorMessage);
    }

    public boolean isWrongCredentialsErrorMessageDisplayed(){
        MobileElement wrongCredentialsErrorMessage = this.automatedActions.waitActions().waitForAnElementToBeVisible(wrongCredentialsErrorMessageXpath);
        return this.automatedActions.displayActions().isElementDisplayed(wrongCredentialsErrorMessage);
    }
}
