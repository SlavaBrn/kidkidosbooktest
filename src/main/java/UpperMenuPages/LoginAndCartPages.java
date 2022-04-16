package UpperMenuPages;

import Const.Const;
import Pages.BasePage;

public class LoginAndCartPages extends BasePage {

    private static final String LOGIN_HEADER = "//h1[text() = 'Login']";
    private static final String CLICK_CREATE_ACCOUNT_LINK = "//a[text() = 'Create account']";
    public static String CART_HEADER = "//h1[text()='Your cart']";

//    --------------------------------------Filling SignIn Form-----------------------------------------------

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

    //    ----------------------------CreateAccountPage Method -------------------------------------------------

     public static final String LOGIN_MAIL_FIELD = "//*[@id = 'CustomerEmail']";
     public static final String SIGN_IN_BUTTON = "//*[@value = 'Sign In']";
     public static final String SIGN_IN_URL = "https://kidkiddos.com/account/login";
     public static final String EMAIL_FIELD_ERROR_MESSAGE = "//*[contains(text( ), '') = 'include an @']";



//---------------------------------------------------------------------------------------------------------------



    public boolean isLoginHeaderVisible(){
        return elementExists(LOGIN_HEADER);
    }


    public boolean isCartHeaderVisible(){
        return elementExists(CART_HEADER);
    }




    public CreateAccountPage openCreateAccountPage(){
        clickElementByXpath(CLICK_CREATE_ACCOUNT_LINK);
        return new CreateAccountPage();
    }

     public boolean isErrorExists(){
        boolean error = elementExists(EMAIL_FIELD_ERROR_MESSAGE);
        return error;

     }
    public void navigateSighInPage (){
        webDriver.get(SIGN_IN_URL);
    }
    public void clickSignButton(){
        clickElementByXpath(SIGN_IN_BUTTON);
    }
}

