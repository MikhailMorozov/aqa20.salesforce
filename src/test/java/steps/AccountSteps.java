package steps;

import io.qameta.allure.Step;
import model.Account;
import model.Contact;
import pages.NewAccountPage;

public class AccountSteps {

    NewAccountPage newAccountPage = new NewAccountPage();

    @Step("Create new account")
    public AccountSteps createNewAccount(Account account) {
        newAccountPage.openPage()
                      .create(account)
                      .clickSave();
        return this;
    }

    @Step("Account is displayed")
    public boolean accountNameIsDisplayed(Account account) {
        return newAccountPage.isAccountNameDisplayed(account);
    }
}
