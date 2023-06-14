package steps;

import io.qameta.allure.Step;
import model.Account;
import pages.NewAccountPage;

public class AccountSteps {

    @Step("Create new account")
    public AccountSteps createNewAccount(Account account) {
        NewAccountPage newAccountPage = new NewAccountPage();
        newAccountPage.openPage()
                      .create(account)
                      .clickSave();
        return this;
    }


}
