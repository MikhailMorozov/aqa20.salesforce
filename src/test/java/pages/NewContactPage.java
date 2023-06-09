package pages;

import model.Contact;
import org.openqa.selenium.WebDriver;

public class NewContactPage extends BasePage{

    public NewContactPage(WebDriver driver) {
        super(driver);
    }


    public static final String SAVE_BUTTON_XPATH = "//button[@title = 'Сохранить']";

    public NewContactPage openPage() {
        driver.get("https://tms5.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    public void create(Contact account) {
        new InputField(driver, accountLabel).writeText(account.getAccountName());
        new InputField(driver, "Веб-узел").writeText(account.getWebSite());
        new DropDown(driver, "Отрасль").selectOption(account.getIndustry());
        clickSave();
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
