package tests;

import model.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.AccountSteps;


public class AccountTest extends BaseTest{
    Account account = new Account("AQA Account 1", "www.onliner.by", "Apparel");
    @Test
    public void createAccountTest() {
        AccountSteps accountSteps = new AccountSteps();
        accountSteps.createNewAccount(account);
        Assert.assertTrue(accountSteps.accountNameIsDisplayed(account), "New account don't create");
    }
}
