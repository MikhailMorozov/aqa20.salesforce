package pages;

    import elements.DropDown;
    import elements.InputField;
    import lombok.extern.log4j.Log4j2;
    import model.Account;
    import org.openqa.selenium.By;
    import utilities.PageUrls;
    import static utilities.StringConstant.*;
@Log4j2
public class NewAccountPage extends BasePage {

        public static final String SAVE_BUTTON_XPATH = "//button[@name = 'SaveEdit']";
        public static final String ACCOUNT_NAME_XPATH = "//a[contains(text(),'%s')]";

        public NewAccountPage openPage() {
            driver.get(PageUrls.ACCOUNT_PAGE);
            return this;
        }

        public NewAccountPage openPageAccountList() {
            driver.get(PageUrls.ACCOUNT_LIST_PAGE);
            return this;
        }

        public NewAccountPage create(Account account) {
            log.info("input account name");
            new InputField(driver, accountLabel).writeTextAccount(account.getAccountName());
            log.info("input Website");
            new InputField(driver, accountWebsite).writeTextAccount(account.getWebSite());
            log.info("select industry");
            new DropDown(driver, accountIndustry).selectOptionAccount(account.getIndustry());
            return this;
        }

        public NewAccountPage clickSave() {
            log.info("click on the Save button");
            driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
            return this;
        }
        public boolean isAccountNameDisplayed (Account account) {
            log.info("is displayed account name");
            return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_XPATH, account.getAccountName()))).isDisplayed();
        }
}
