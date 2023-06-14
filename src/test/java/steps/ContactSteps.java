package steps;

import io.qameta.allure.Step;
import model.Contact;
import pages.NewContactPage;

public class ContactSteps {

    @Step("create new contact")
    public ContactSteps createNewContact(Contact contact) {
        NewContactPage newContactPage = new NewContactPage();
        newContactPage.openPage()
                .create(contact)
                .clickSave();
        return this;
    }
}
