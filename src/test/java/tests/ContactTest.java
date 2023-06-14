package tests;


import model.Contact;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ContactSteps;

public class ContactTest extends BaseTest{

    Contact contact = new Contact("Dr.","Mike", "Smith", "AQA Account 1");

    @Test
    public void createContactTest(){
        ContactSteps contactSteps = new ContactSteps();
        contactSteps.createNewContact(contact);
        Assert.assertTrue(contactSteps.contactIsDisplayed(contact), "New contact don't create");
    }
}
