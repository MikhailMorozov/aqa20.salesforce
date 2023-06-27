package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.Contact;
import pages.NewContactPage;
@Log4j2
public class ContactSteps {
    NewContactPage newContactPage = new NewContactPage();

    @Step("Create new contact")
    public ContactSteps createNewContact(Contact contact) {
        log.info("Create new contact");
        newContactPage.openPageNewContact()
                .create(contact)
                .clickSave();
        return this;
    }

    @Step("Contact is displayed")
    public boolean contactIsDisplayed(Contact contact) {
        log.info("Contact is displayed");
        return newContactPage.isFullNameContactDisplayed(contact);
    }
}
