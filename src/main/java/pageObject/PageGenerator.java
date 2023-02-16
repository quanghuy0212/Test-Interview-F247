package pageObject;

import common.BaseAction;
import org.openqa.selenium.WebDriver;

public class PageGenerator extends BaseAction {
    WebDriver driver;

    public static TestPO getTestPO(WebDriver driver){
        return new TestPO(driver);
    }
}
