package tests;

import driver.DriverSingleton;
import model.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import steps.LoginSteps;
import utilities.TestListener;


@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;
    User user = new User("oybotk-zk2a@force.com", "TMSAQA20onl", "https://power-platform-6242.my.salesforce.com/");

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @BeforeClass
    public void loginSite() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(user);
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
