import Pages.BasePage;
import Pages.ContactUsPage;
import Pages.MainPage;
import Util.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class ContactUsTestPage extends UseCaseBase {
    public static ContactUsPage contactUsPage;


    @BeforeAll
    public static void classSetup() {
        contactUsPage = new ContactUsPage();

    }

    @BeforeEach
    public void beforeTest() {
        contactUsPage.navigateContactUsPage();
    }

    //
    @Test
    public void emptyFieldsButtonPress() {
//        contactUsPage.sent(ContactUsPage.Name_Field,ContactUsPage.Null_Field_Text);
//        contactUsPage.sent(ContactUsPage.Mail_Field,ContactUsPage.Null_Field_Text);
//        contactUsPage.sent(ContactUsPage.Message_Field,ContactUsPage.Null_Field_Text);
        contactUsPage.sendButton();
        boolean error = contactUsPage.isPageTitleVisible();
        assertTrue(error);
    }


    @ParameterizedTest
    @ValueSource(strings = {ContactUsPage.Empty_Field_Text, ContactUsPage.Null_Field_Text, ContactUsPage.NameRussian_Field_Text})
    public void nameFieldParam(String nameInput) {
//       basePage = new BasePage();
        contactUsPage.sent(ContactUsPage.Name_Field, nameInput);
        contactUsPage.sendButton();
        boolean errorName = contactUsPage.isNameError();
        assertTrue(errorName);
    }

    @ParameterizedTest
    @ValueSource(strings = {ContactUsPage.IncompleteMail_Field_Text, ContactUsPage.MailRussian_Field_Text,})
    public void emailFieldParam(String mailInput) {
//        basePage = new BasePage();
//        contactUsPage.clickElementByXpath(ContactUsPage.Mail_Field);
        contactUsPage.sent(ContactUsPage.Mail_Field, mailInput);
        contactUsPage.sendButton();
//        contactUsPage.takesScreenshot("1111");
        boolean errorName = contactUsPage.isEmailWrong();
        assertTrue(errorName);
    }

    @Test
    public void sentHeader() {
        contactUsPage.sent(ContactUsPage.Name_Field, ContactUsPage.Long_Field_Text);
        contactUsPage.sent(ContactUsPage.Mail_Field, ContactUsPage.CorrectFormat_Mail_Field_Text);
        contactUsPage.sent(ContactUsPage.Message_Field, ContactUsPage.specialChar_Field_Text);
        contactUsPage.sendButton();
        boolean isVisible = contactUsPage.isPageTitleVisible1();
        assertTrue(isVisible);

    }
    @Test
    public void geTitleTest(){
       String result = contactUsPage.getTitle();
       assertEquals("Contact us",result);
    }


}
