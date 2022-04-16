package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver {
    public static WebDriver webDriver12;

    public enum Browser {
        CHROME,
        FIREFOX,
        IE


    }

    protected static WebDriver getWebDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                webDriver12 = new ChromeDriver();
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                webDriver12 = new FirefoxDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                webDriver12 = new InternetExplorerDriver();
                break;

        }
        webDriver12.manage().window().maximize();
        webDriver12.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return webDriver12;
    }

    protected static void closeDriver() {
        if (webDriver12 != null) {
            webDriver12.close();
        }

    }
}