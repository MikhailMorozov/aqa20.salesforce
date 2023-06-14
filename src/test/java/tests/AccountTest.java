package tests;

import model.User;
import org.testng.annotations.Test;
import steps.LoginSteps;

public class AccountTest extends BaseTest{

    User user = new User("ckotd-9hz7@force.com", "TMSAQA20onl", "https://eu44.lightning.force.com");
    @Test
    public void createAccount() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.login(user);

    }


}
