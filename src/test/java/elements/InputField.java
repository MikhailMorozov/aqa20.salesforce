package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputField {
    WebDriver driver;
    String label;

    private static final int EXPLICITLY_WAIT_TIMEOUT_SECOND = 30;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public static final String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    public static final String INPUT_CONTACT_XPATH = "//input[@placeholder='%s']";


    public void writeTextAccount(String text) {
        new WebDriverWait(driver, EXPLICITLY_WAIT_TIMEOUT_SECOND).until(ExpectedConditions
                .visibilityOf(driver.findElement(By.xpath(String.format(INPUT_XPATH, label))))).sendKeys(text);
    }

    public void writeTextContact(String text) {
        new WebDriverWait(driver, EXPLICITLY_WAIT_TIMEOUT_SECOND).until(ExpectedConditions
                .visibilityOf(driver.findElement(By.xpath(String.format(INPUT_CONTACT_XPATH, label))))).sendKeys(text);
    }
}
