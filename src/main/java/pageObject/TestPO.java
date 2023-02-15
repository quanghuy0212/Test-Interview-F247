package pageObject;

import common.BaseAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageUI.TestUI;

public class TestPO extends BaseAction {
    private WebDriver driver;

    public TestPO(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForHomPageDisplayed(WebDriver driver) {
        waitForElementVisible(driver, TestUI.LOGO_PAGE);
    }

    public void clickToLoginButton(WebDriver driver) {
        waitForElementCLickable(driver, TestUI.LOGIN_BUTTON_HEADER);
        clickToElement(driver, TestUI.LOGIN_BUTTON_HEADER);
    }

    public void inputUsername(WebDriver driver, String username) {
        waitForElementVisible(driver, TestUI.USERNAME_FIELD);
        sendkeyToElement(driver, TestUI.USERNAME_FIELD, username);
    }

    public void inputPassword(WebDriver driver, String password) {
        waitForElementVisible(driver, TestUI.PASSWORD_FIELD);
        sendkeyToElement(driver, TestUI.PASSWORD_FIELD, password);
    }

    public void clickToLoginButtonInForm(WebDriver driver) {
        waitForElementCLickable(driver, TestUI.LOGIN_BUTTON_FORM);
        clickToElement(driver, TestUI.LOGIN_BUTTON_FORM);
    }

    public boolean verifyLoginSuccess(WebDriver driver) {
        return isElementDisplayed(driver, TestUI.LOG_OUT_ICON);
    }

    public void clickAddNewTopicButton(WebDriver driver) {
        waitForElementCLickable(driver, TestUI.CREATE_TOPIC_BUTTON_HEADER);
        clickToElement(driver, TestUI.CREATE_TOPIC_BUTTON_HEADER);
    }

    public void inputTitleTopic(WebDriver webDriver, String title) {
        waitForElementVisible(driver, TestUI.TITLE_TOPIC);
        sendkeyToElement(driver, TestUI.TITLE_TOPIC, title);
    }

    public void selectCateGory(WebDriver driver) throws InterruptedException {
        waitForElementCLickable(driver, TestUI.CATEGORY_COMBO_BOX);
        clickToElement(driver, TestUI.CATEGORY_COMBO_BOX);
        Thread.sleep(500);
        waitForElementCLickable(driver, TestUI.RANDOM_CATEGORY_VALUE);
        clickToElement(driver, TestUI.RANDOM_CATEGORY_VALUE);
    }

    public void selectIDStock(WebDriver driver) throws InterruptedException {
        waitForElementCLickable(driver, TestUI.ID_COMBO_BOX);
        clickToElement(driver, TestUI.ID_COMBO_BOX);
        Thread.sleep(500);
        waitForElementCLickable(driver, TestUI.RANDOM_ID_VALUE);
        clickToElement(driver, TestUI.RANDOM_ID_VALUE);
    }

    public void inputContent(WebDriver driver, String content) {
        waitForElementVisible(driver, TestUI.CONTENT_TEXTAREA);
        clickToElement(driver, TestUI.CONTENT_TEXTAREA);
        sendkeyToElement(driver, TestUI.CONTENT_TEXTAREA, content);
    }

    public void clickCreateTopicButton(WebDriver driver) {
        waitForElementCLickable(driver, TestUI.CREATE_TOPIC_BUTTON_IN_FORM);
        clickToElement(driver, TestUI.CREATE_TOPIC_BUTTON_IN_FORM);
    }

    public void logoutAccount(WebDriver driver) throws InterruptedException {
        waitForElementCLickable(driver, TestUI.LOG_OUT_ICON);
        clickToElement(driver, TestUI.LOG_OUT_ICON);
        Thread.sleep(500);
        waitForElementCLickable(driver, TestUI.CONFIRM_LOGOUT_BUTTON);
        clickToElement(driver, TestUI.CONFIRM_LOGOUT_BUTTON);
    }

    public void waitForAddTopicSuccess(WebDriver driver) {
        waitForElementInvisible(driver, TestUI.SPINNER);
    }

    public void likePostAdded(WebDriver driver) throws InterruptedException {
        waitForElementCLickable(driver, TestUI.ICON_LIKE_POST);
        clickToElement(driver, TestUI.ICON_LIKE_POST);
        Thread.sleep(3000);
    }

}
