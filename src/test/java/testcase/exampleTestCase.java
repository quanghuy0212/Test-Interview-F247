package testcase;

import common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.PageGenerator;
import pageObject.TestPO;

import java.sql.Driver;

public class exampleTestCase extends BaseTest {
    WebDriver driver;
    TestPO testPO;
    String username1 = "quanghuy021299";

    String username2 = "tester";
    String password1 = "Huy021299";

    String password2 = "Test@f247.com";

    String titleTopic = "Auto Tester – Quang Huy 15/02/2023";

    String randomContent = "Interview Test 15/02/2023";


    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String appUrl) {
        driver = getBrowserDriver(browserName, appUrl);
        driver.manage().window().maximize();

        testPO = PageGenerator.getTestPO(driver);
    }

    @Test
    public void TC_01() throws InterruptedException {
        testPO.waitForHomPageDisplayed(driver);

        testPO.clickToLoginButton(driver);

        testPO.inputUsername(driver, username1);

        testPO.inputPassword(driver, password1);

        testPO.clickToLoginButtonInForm(driver);

        Assert.assertTrue(testPO.verifyLoginSuccess(driver));

        testPO.clickAddNewTopicButton(driver);

        testPO.inputTitleTopic(driver, titleTopic);

        testPO.selectCateGory(driver);

        testPO.selectIDStock(driver);

        testPO.inputContent(driver, randomContent);

        testPO.clickCreateTopicButton(driver);

        testPO.waitForAddTopicSuccess(driver);

        testPO.logoutAccount(driver);

        testPO.waitForHomPageDisplayed(driver);

        testPO.clickToLoginButton(driver);

        testPO.inputUsername(driver, username2);

        testPO.inputPassword(driver, password2);

        testPO.clickToLoginButtonInForm(driver);

        Assert.assertTrue(testPO.verifyLoginSuccess(driver));

        testPO.likePostAdded(driver);

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}
