import Pages.*;
import Util.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

public class MainTestPage extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainTestPage.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();

    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }


//    ---------------------------- Opening Main Pages Tabs ----------------------------


    @Test
    public void mainPageLoadTest() {
        boolean success = mainPage.isLogoVisible();
        assertTrue(success);

    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab1();
        boolean isLoad = contactUsPage.isPageTitleVisible();
        assertTrue(isLoad);
    }

    @Test
    public void openSpanishPage() {
        Spanish spanish = mainPage.openSpanishPage();
        boolean isLoad = spanish.isHeaderVisible();
        assertTrue(isLoad);
    }

    @Test
    public void openMandarinPage() {
        LanguagePages mandarin = mainPage.openMandarinPage();
        boolean isLoad = mandarin.isMandarinHeaderVisible();
        assertTrue(isLoad);
    }

    @Test
    public void openGalleryPage() {
        Gallery gallery = mainPag.openGalleryPage();
        logger.info("main page Gallery load test");
        boolean isLoad = gallery.isHeaderVisible();
        assertTrue(isLoad);
    }

//    @Test
//    public void openFrenchPage() {
//        France france = mainPage.openFrenchPage();
//        boolean isLoad = france.isHeaderVisible();
//        assertTrue(isLoad);
//    }
    @Test
    public void openFrenchPage() {
        LanguagePages languagePages = mainPage.openFrenchPage();
        boolean isLoad = languagePages.isFrenchVisible();
        assertTrue(isLoad);
    }

//    @Test
//    public void openBlogPage() {
//        Blog blog = mainPage.openBlogPage();
//        boolean isLoad = blog.isHeaderVisible();
//        assertTrue(isLoad);
//    }
    @Test
    public void openBlogPage() {
        LanguagePages languagePages = mainPage.openBlogPage();
        boolean isLoad = languagePages.isHeaderVisible();
        assertTrue(isLoad);
    }

    //    ---------------------- Open Drop Down Pages-----------------------------
    @Test
    public void openVideoPage() {
        mainPage.clickResourcesDropDown();
        Resources resources = mainPage.openResourcePage();
        boolean isLoad = resources.isHeaderVisible();
        assertTrue(isLoad);

    }

    @Test
    public void openAfrikaansPage() {
        mainPage.clickLanguageDrop();
        MainPage.AfrikaansPage afrikaansPage = mainPage.openAfrikaanTab();
        boolean isLoad = afrikaansPage.isAfrikaansVisible();
        assertTrue(isLoad);

    }

    @Test
    public void openFarsiPage() {
        mainPage.clickLanguageDrop();
        MainPage.HorvatPage horvatPage = mainPage.openHorvatTab();
        boolean isLoad = horvatPage.isFarsiVisible();
        assertTrue(isLoad);
    }

    @Test
    public void ChooseFromDropDown() {
        mainPage.clickLanguageDrop();
        boolean success = mainPage.isAfrikanElementExists();
        assertTrue(success);

    }

    @Test
    public void AlbanianTab() {
        mainPage.clickEbookLanguageDrop();
        MainPage.AlbanianEbook albanianEbook = mainPage.openAlbanEbook();
        boolean isLoad = albanianEbook.isAlbanianEbookVisible();
        assertTrue(isLoad);

    }
    @Test
    public void AUD(){
        mainPage.clickFlagDropDown();
        boolean isAud = mainPage.isAUD();
        assertTrue(isAud);

    }


}
