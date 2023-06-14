package pages;


    import elements.DropDown;
    import elements.InputField;
    import model.Account;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import utilities.PageUrls;

    import static utilities.StringConstant.*;

public class NewAccountPage extends BasePage {

        public static final String SAVE_BUTTON_XPATH = "//button[@title = 'Save']";

        public NewAccountPage openPage() {
            driver.get(PageUrls.ACCOUNT_PAGE);
            return this;
        }

        public NewAccountPage create(Account account) {
            new InputField(driver, accountLabel).writeTextAccount(account.getAccountName());
            new InputField(driver, accountWebsite).writeTextAccount(account.getWebSite());
            new DropDown(driver, accountIndustry).selectOptionAccount(account.getIndustry());
            return this;
        }

        public NewAccountPage clickSave() {
            driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
            return this;
        }
    }
