import Pages.MainPage;
import UpperMenuPages.CreateAccountPage;
import UpperMenuPages.LoginAndCartPages;
import Util.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;


public class UpperMenuTest extends UseCaseBase {
    public static LoginAndCartPages loginAndCartPages;
    public static MainPage mainPage;
    WebDriver driver;
    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        LoginAndCartPages loginAndCartPages = mainPage.openLoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void isHeaderVisible() {
        LoginAndCartPages loginAndCartPages = mainPage.openLoginPage();
        boolean isVisible = loginAndCartPages.isLoginHeaderVisible();
        assertTrue(isVisible);

    }


    @Test
    public void IsCreatePageHeaderVisible() {
        loginAndCartPages = new LoginAndCartPages();
//        ЛЕВ У МЕНЯ НЕ ПРОХОДИЛ ЭТОТ ТЕСТ ДО ТЕХ ПОР ПОКА Я НЕ ДОБАВИЛ СТРОКУ СВЕРХУ ИЛИ НАДО БЫЛО ОТДЕЛЬНУЮ ДЕЛАТЬ ТЕСТ СТРАНИЦУ?
        mainPage.clickLogIn();
        CreateAccountPage createAccountPage = loginAndCartPages.openCreateAccountPage();
        boolean isVis = createAccountPage.isHeaderVisible();
        assertTrue(isVis);
    }

    @ParameterizedTest
    @ValueSource(strings = {LoginAndCartPages.IncompleteMail_Field_Text, LoginAndCartPages.Long_Field_Text,LoginAndCartPages.CorrectFormat_Mail_Field_Text})
//    лев почему последний тест прошел? ведь там не должен появляться никакой эрор месседж?
    public void signInFieldCheck(String mailInput) {
        loginAndCartPages = new LoginAndCartPages();
        loginAndCartPages.navigateSighInPage();
        loginAndCartPages.sent(LoginAndCartPages.LOGIN_MAIL_FIELD, mailInput);
        loginAndCartPages.clickSignButton();
//        mainPage.takesScreenshot("mailfield");
        boolean error = loginAndCartPages.isErrorExists();
        assertTrue(error);
    }


    @Test
    public void isCartHeaderVisible() {
        LoginAndCartPages cartPage = mainPage.openCartPage();
        boolean isVis = cartPage.isCartHeaderVisible();
        assertTrue(isVis);

    }
//    @ParameterizedTest
//    @ValueSource(strings = {LoginAndCartPages.IncompleteMail_Field_Text,LoginAndCartPages.Long_Field_Text})

//    почему параметрайзд тест нельзя писать тут а нужно это делать в середине?


}


