package Pages;

import Const.Const;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  ContactUsPage extends BasePage {
    public static final String Contact_Us_Header = "//h1[text()='Contact us']";
    public static final String Sent_Message_Header = "//div[@class ='_form-thank-you']";
    public static final String Name_Field = "//input[@name='field[3]']";
    public static final String Mail_Field = "//input[@name='email']";
    public static final String Message_Field = "//textarea[@name='field[7]']";
    public static final String Click_Button = "//button[@class='_submit']";
    public static final String Name_Error_Message = "//div[text() ='This field is required.']";
    public static final String Email_Error_Message = "//div[text() = 'Enter a valid email address.']";
    public static final String Empty_Field_Text = "                     ";
    public static final String Null_Field_Text = "";

    public static final String Long_Field_Text = "uhuehfeufhneiffeufheuncxcjrogromrfmrfmr45673484829";
    public static final String specialChar_Field_Text = "6*^%$%^&*&*((((&******%%##&*())";
    public static final String IncompleteMail_Field_Text = "@ceieie.com";
    public static final String NameRussian_Field_Text = "МашаМиша";
    public static final String MailRussian_Field_Text = "ттывгурвугв@yde.com";
    public static final String CorrectFormat_Mail_Field_Text = "jcbdjc@kovr.com";

    public static final Logger logger = LogManager.getLogger(ContactUsPage.class);





    public boolean isPageTitleVisible() {

       return elementExists(Contact_Us_Header);
    }
    public String getTitle(){
       return findElementByXpath(Contact_Us_Header).getText();

    }

    public boolean isPageTitleVisible1() {
        return elementExists(Sent_Message_Header);
    }
    public void navigateContactUsPage (){
        webDriver.get(Const.Contact_Us_URL);
    }

    public void sendButton(){
       clickElementByXpath(Click_Button);
    }
    public boolean isNameError(){
        logger.info("check if name field error message is appears when char required");
        boolean message = elementExists(Name_Error_Message);
        return message;
    }

    public boolean isEmailWrong(){
        boolean message = elementExists(Email_Error_Message);
        return message;
    }

//    public WebElement hhh (){
//        WebElement element = findElementByXpath(Email_Error_Message);
//        return element;
//    }

}
