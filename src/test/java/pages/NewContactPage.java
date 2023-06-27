package pages;

import elements.DropDown;
import elements.InputField;
import lombok.extern.log4j.Log4j2;
import model.Contact;
import org.openqa.selenium.By;
import utilities.PageUrls;

import static utilities.StringConstant.*;
@Log4j2
public class NewContactPage extends BasePage{

    public static final String SAVE_BUTTON_XPATH = "//button[@name='SaveEdit']";

    public final static String FULL_NAME_CONTACT = "//span[contains(text(),'%s')]";

    public NewContactPage openPageNewContact() {
        driver.get(PageUrls.CONTACT_PAGE);
        return this;
    }

    public NewContactPage create(Contact contact) {
        log.info("select Salutation");
        new DropDown(driver, contactSalutation).selectOptionContact(contact.getSalutation());
        log.info("input first name");
        new InputField(driver, contactFirstName).writeTextContact(contact.getFirstName());
        log.info("input last name");
        new InputField(driver, contactLastName).writeTextContact(contact.getLastName());
        return this;
    }

    public NewContactPage clickSave() {
        log.info("click on the Save button");
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
        return this;
    }

    public boolean isFullNameContactDisplayed (Contact contact) {
        log.info("is displayed full name");
        return driver.findElement(By.xpath(String.format(FULL_NAME_CONTACT, contact.getFirstName() + " " + contact.getLastName()))).isDisplayed();
    }
}
