package pages;

import elements.DropDown;
import elements.InputField;
import model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PageUrls;

import static utilities.StringConstant.*;

public class NewContactPage extends BasePage{

    public static final String SAVE_BUTTON_XPATH = "//button[@title = 'Save']";

    public NewContactPage openPage() {
        driver.get(PageUrls.CONTACT_PAGE);
        return this;
    }

    public NewContactPage create(Contact contact) {
        new DropDown(driver, contactSalutation).selectOptionContact(contact.getSalutation());
        new InputField(driver, contactFirstName).writeTextContact(contact.getFirstName());
        new InputField(driver, contactLastName).writeTextContact(contact.getLastName());
        new InputField(driver, contactAccountName).writeTextContact(contact.getAccountName());
        return this;
    }

    public NewContactPage clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
        return this;
    }
}
