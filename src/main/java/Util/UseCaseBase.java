package Util;


import Pages.BasePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class UseCaseBase {
    private static WebDriver webDriver1;
    private static BasePage page;

    @BeforeAll
    public static void setupMain() {
        page = new BasePage();
        webDriver1 = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        page.set111Driver(webDriver1);
//       came from BasePage

    }

    @AfterAll
    public static void tearDownMain() {
        SharedDriver.closeDriver();
    }
}
