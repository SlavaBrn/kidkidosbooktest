package UpperMenuPages;

import Pages.BasePage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private static final String CREATE_ACCOUNT_PAGE = "//h1[text() = 'Create Account']";
    //    --------------------------------------Filling createaccount Forms-----------------------------------------------

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
    public static final String CorrectFormat_Mail_Field_Text = "jcbdjc@gmail.com";

    //    -----------------------------for Methods --------------------------------------------------------
    public static final String Navigate_Page = "https://kidkiddos.com/account/register";

    public boolean isHeaderVisible() {
        return elementExists(CREATE_ACCOUNT_PAGE);

    }

    public void navigateToCreatePage() {
        webDriver.get(Navigate_Page);
    }

}