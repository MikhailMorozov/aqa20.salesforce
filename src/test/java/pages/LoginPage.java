package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import utilities.PageUrls;
@Log4j2
public class LoginPage extends BasePage{

    private static final By USERNAME_INPUT = By.xpath("//input[@id='username']");
    private static final By PASSWORD_INPUT = By.xpath("//input[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//input[@id='Login']");

    public LoginPage openPage () {
        driver.get(PageUrls.LOGIN_PAGE);
        return this;
    }

    public LoginPage inputUsername(String username) {
        log.info("Enter login");
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        return this;
    }

    public LoginPage inputPassword(String password) {
        log.info("Enter password");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        log.info("Click on the login button");
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }
}
