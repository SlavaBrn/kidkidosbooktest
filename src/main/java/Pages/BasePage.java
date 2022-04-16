package Pages;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BasePage {
   protected static WebDriver webDriver;
   protected static WebDriverWait wait;
    public static final Logger logger = LogManager.getLogger(BasePage.class);

    public void set111Driver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 5);
    }

    public void clickElementByXpath(String xpath) {
        logger.info("click element with xpath" + xpath);
        findElementByXpath(xpath).click();

    }
    protected void locateElementByXpath (String xpath){
        findElementByXpath(xpath);
    }


    protected void sendKeysByXpath(String xpath, String text) {
        findElementByXpath(xpath).sendKeys(text);
    }
    public void sent(String xpath,String text){
        findElementByXpath(xpath).sendKeys(text);
    }


    public boolean elementExists(String xpath) {
        try {
            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {

        }
        return false;
    }

    protected WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;

    }
    protected String getCurrentUrl(){
       return webDriver.getCurrentUrl();
    }

    public void takesScreenshot (String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("screenshot/"+ name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
//        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file,new File("screenshot/" + name + "jpg"));
//        FileUtils.copyFile(file,new File("screenshot/" +name + ".jpg"));
    }
}

