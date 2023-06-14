package steps;

import io.qameta.allure.Step;
import model.User;
import pages.LoginPage;

public class LoginSteps {

    @Step("Login on site")
    public LoginSteps login (User user) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage()
                .inputUsername(user.getLogin())
                .inputPassword(user.getPassword())
                .clickLoginButton();
        return this;
    }
}
