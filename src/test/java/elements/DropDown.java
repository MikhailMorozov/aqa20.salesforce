package elements;

import driver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    private static final String DROP_DOWN_ACCOUNT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//a";
    private static final String DROP_DOWN_CONTACT_XPATH = "//*[contains(text(),'%s')]/following::button[1]";
    private static final String SELECT_OPTION_ACCOUNT_XPATH = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";
    private static final String SELECT_OPTION_CONTACT_XPATH = "//*[@data-value='%s']";

    public void selectOptionAccount(String option) {
        new WebDriverWait(driver, 15).until(ExpectedConditions
                .visibilityOf(driver.findElement(By.xpath(String.format(DROP_DOWN_ACCOUNT_XPATH, label))))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_ACCOUNT_XPATH, option))).click();
    }

    public void selectOptionContact(String option) {
        new WebDriverWait(driver, 15).until(ExpectedConditions
                .visibilityOf(driver.findElement(By.xpath(String.format(DROP_DOWN_CONTACT_XPATH, label))))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_CONTACT_XPATH, option))).click();
    }
}
