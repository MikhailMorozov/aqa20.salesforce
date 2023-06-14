package tests;

import driver.DriverSingleton;
import model.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.LoginSteps;
import utilities.TestListener;


@Listeners(TestListener.class)
public class BaseTest {
    protected WebDriver driver;

    User user = new User("ckotd-9hz7@force.com", "TMSAQA20onl", "https://eu44.lightning.force.com");

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @BeforeMethod
    public void loginSite() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(user);
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
