package Pages;

import Const.Const;
import UpperMenuPages.LoginAndCartPages;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage {
    private static final String LogoImage = "//img[@itemprop='logo']";
    private static final String Contact_Us_page = "//a[text()='Contact us']";
    private static final String Spanish_page = "//a[text()='Español']";
    private static final String Mandarin_page = "//a[text()='中文']";
    private static final String Gallery_page = "//a[text()='Gallery']";
    private static final String French_page = "//a[text()='Français']";
    private static final String Blog_page = "//a[text()='Blog']";
    private static final String Resources_Video_Page = "//a[text()='Blog']";


    //    ---------------------------Regular Book Tabs------------------------------------------
    private static final String Language_Drop_Down = "//a[@aria-has-popup = 'true']";
    private static final String Africaan_Tab = "//a[text() = 'Afrikaans']";
    private static final String Horvat_Tab = "//a[text() = 'Croatian - Hrvatski']";


    //  ------------------------  EbooksTab------------------------------------------------
    private static final String Ebook_Language_Drop_Down = "//a[@aria-controls = 'SiteNavLabel-ebooks-by-language']";
    private static final String Ebook_Albanian_Tab = "//a[text()='Albanian- Shqip']";

//    --------------------------- Resources Tab -------------------------------------------------

    private static final String Resources_Drop_Down = "//a[@aria-controls='SiteNavLabel-resources']";
    private static final String Video_Tab = "//a[text()='Videos']";

    //    ------------------------------UpperMenuTabs----------------------------------------------------
    private static final String LOGIN_PAGE = "//h[text() = 'Login']";
    private static final String CREATE_ACCOUNT_PAGE = "//h[text() = 'Create Account']";
    private static final String YOUR_CART_PAGE = "//h[text() = 'Your cart']";
    private static final String CLICK_LOGIN_TAB = "//*[@class = 'icon icon-login']";
    private static final String CLICK_CART_TAB = "//*[@class = 'icon icon-cart']";
    private static final String CLICK_CREATE_ACCOUNT_LINK = "//*[text() = ' Create account']";

//    ----------------------------------FLAGS AND CURRENCIES------------------------------------------------
    private static final String CLICK_DROP_DOWN = "//*[@class = 'cbb-currency-flag']";
    private static final String AUD_CURRENCY = "//*[text() = 'AUD']";




    public void navigateToMainPage() {
        webDriver.get(Const.Main_URL);
    }

    public boolean isLogoVisible() {
        boolean logo = elementExists(LogoImage);
        return logo;
    }

    public ContactUsPage openContactUsTab1() {
        clickElementByXpath(Contact_Us_page);
        return new ContactUsPage();
    }

    public AfrikaansPage openAfrikaanTab() {
        clickElementByXpath(Africaan_Tab);
        return new AfrikaansPage();

    }

    public HorvatPage openHorvatTab() {
        clickElementByXpath(Horvat_Tab);
        return new HorvatPage();
    }

    public AlbanianEbook openAlbanEbook() {
        clickElementByXpath(Ebook_Albanian_Tab);
        return new AlbanianEbook();
    }

    public Spanish openSpanishPage() {
        clickElementByXpath(Spanish_page);
        return new Spanish();
    }

    public LanguagePages openMandarinPage() {
        clickElementByXpath(Mandarin_page);
        return new LanguagePages();
    }

    public Gallery openGalleryPage() {
        clickElementByXpath(Gallery_page);
        return new Gallery();
    }

    public LanguagePages openFrenchPage() {
        clickElementByXpath(French_page);
        return new LanguagePages();
    }

    public LanguagePages openBlogPage() {
        clickElementByXpath(Blog_page);
        return new LanguagePages();
    }

    public Resources openResourcePage() {
        clickElementByXpath(Video_Tab);
        return new Resources();
    }


    public boolean isAfrikanElementExists() {
        boolean element = elementExists(Africaan_Tab);
        return element;
    }

    public void clickResourcesDropDown() {
        clickElementByXpath(Resources_Drop_Down);
    }


    public void clickLanguageDrop() {
        clickElementByXpath(Language_Drop_Down);
    }

    public void clickEbookLanguageDrop() {
        clickElementByXpath(Ebook_Language_Drop_Down);

    }
//   ------------ This is Inner class(class Afrikaans page inside main page class)------------------

    public static class AfrikaansPage extends BasePage {
        public static final String Arikaans_Header = "//h1[text()= 'Afrikaans']";


        public boolean isAfrikaansVisible() {
            return elementExists(Arikaans_Header);

        }
    }

    public static class HorvatPage extends BasePage {
        public static final String Horvat_Logo = "//h1[text() = 'Croatian - Hrvatski']";

        public boolean isFarsiVisible() {
            return elementExists(Horvat_Logo);
        }
    }

//    ----------------------Ebook Tabs inner class------------------------------

    public static class AlbanianEbook extends BasePage {
        public static final String Alban_Ebook_Header = "//h1[text() = 'eBooks in Albanian- Shqip']";

        public boolean isAlbanianEbookVisible() {
            return elementExists(Alban_Ebook_Header);
        }
    }


//-----------------------------------UpperTabMenu------------------------------------------

    public LoginAndCartPages openLoginPage() {
        clickElementByXpath(CLICK_LOGIN_TAB);
        return new LoginAndCartPages();
    }

    public void clickLogIn() {
        clickElementByXpath(CLICK_LOGIN_TAB);
    }

    public LoginAndCartPages openCartPage() {
        clickElementByXpath(CLICK_CART_TAB);
        return new LoginAndCartPages();
    }

//     -------------------------------fLAGS AND CURRENCY--------------------------------------
    public void clickFlagDropDown(){
        clickElementByXpath(CLICK_DROP_DOWN);
    }
//    я тут только проверил что австралийскря валюта существует в дроп даун листе но как проверить что когда я выберу австралию у меня откроется
//    //                соответствуещая страница,я не могу жто сделать
    public boolean isAUD(){
       boolean aud = elementExists(AUD_CURRENCY);
       return aud;
//       я тут только проверил что австралийскря валюта существует в дроп даун листе но как проверить что когда я выберу австралию у меня откроется
//                соответствуещая страница,я не могу жто сделать

    }



}