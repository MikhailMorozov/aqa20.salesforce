package pages;

import elements.DropDown;
import elements.InputField;
import model.Contact;
import org.openqa.selenium.By;
import utilities.PageUrls;


import static elements.InputField.INPUT_CONTACT_XPATH;
import static utilities.StringConstant.*;

public class NewContactPage extends BasePage{

    public static final String SAVE_BUTTON_XPATH = "//button[@name = 'SaveEdit']";

    public final static String FULL_NAME_CONTACT = "//span[contains(text(),'%s')]";

    public NewContactPage openPageNewContact() {
        driver.get(PageUrls.CONTACT_PAGE);
        return this;
    }

    public NewContactPage create(Contact contact) {
        new DropDown(driver, contactSalutation).selectOptionContact(contact.getSalutation());
        new InputField(driver, contactFirstName).writeTextContact(contact.getFirstName());
        new InputField(driver, contactLastName).writeTextContact(contact.getLastName());
        new InputField(driver, contactAccountName).writeTextContact(contact.getAccountName());
        driver.findElement(By.xpath("//*[@id='dropdown-element-2066']/ul/li[2]")).click();
        return this;
    }

    public NewContactPage clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
        return this;
    }

    public boolean isFullNameContactDisplayed (Contact contact) {
        return driver.findElement(By.xpath(String.format(FULL_NAME_CONTACT, contact.getFirstName() + " " + contact.getLastName()))).isDisplayed();
    }
}
