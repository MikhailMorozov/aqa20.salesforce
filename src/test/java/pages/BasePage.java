package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
