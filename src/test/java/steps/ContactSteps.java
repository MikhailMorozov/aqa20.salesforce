package steps;

import io.qameta.allure.Step;
import model.Contact;
import pages.NewContactPage;

public class ContactSteps {

    @Step("create new contact")
    public ContactSteps createNewContact(Contact contact) {
        NewContactPage newContactPage = new NewContactPage();
        newContactPage.openPageNewContact()
                .create(contact)
                .clickSave();
        return this;
    }

    @Step("Contact is displayed")
    public boolean contactIsDisplayed(Contact contact) {
        NewContactPage newContactPage = new NewContactPage();
        return newContactPage.isFullNameContactDisplayed(contact);
    }
}
