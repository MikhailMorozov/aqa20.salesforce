package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverSingleton.getInstance().getDriver();
    }
}
