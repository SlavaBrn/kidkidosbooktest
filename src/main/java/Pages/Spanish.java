package Pages;

public class Spanish extends BasePage{
    public static final String Spanish_Header = "//h1[text()= 'Spanish - Español']";
    public boolean isHeaderVisible(){
        return elementExists(Spanish_Header);
    }
}
