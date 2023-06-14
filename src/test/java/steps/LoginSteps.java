package steps;

import model.User;
import pages.LoginPage;

public class LoginSteps {

    public LoginSteps login (User user) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage()
                .inputUsername(user.getLogin())
                .inputPassword(user.getPassword())
                .clickLoginButton();
        return this;
    }
}
