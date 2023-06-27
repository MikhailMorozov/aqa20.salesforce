package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.Account;
import pages.NewAccountPage;
@Log4j2
public class AccountSteps {

    NewAccountPage newAccountPage = new NewAccountPage();

    @Step("Create new account")
    public AccountSteps createNewAccount(Account account) {
        log.info("Create new account");
        newAccountPage.openPage()
                      .create(account)
                      .clickSave()
                      .openPageAccountList();
        return this;
    }

    @Step("Account is displayed")
    public boolean accountNameIsDisplayed(Account account) {
        log.info("Account is displayed");
        return newAccountPage.isAccountNameDisplayed(account);
    }
}
