package steps;

import io.qameta.allure.Step;
import model.Contact;
import pages.NewContactPage;

public class ContactSteps {
    NewContactPage newContactPage = new NewContactPage();

    @Step("create new contact")
    public ContactSteps createNewContact(Contact contact) {
        newContactPage.openPageNewContact()
                .create(contact)
                .clickSave();
        return this;
    }

    @Step("Contact is displayed")
    public boolean contactIsDisplayed(Contact contact) {
        return newContactPage.isFullNameContactDisplayed(contact);
    }
}
