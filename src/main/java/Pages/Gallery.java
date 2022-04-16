package Pages;

public class Gallery extends BasePage {
    public static final String Gallery_Header = "//h1[text()= 'Gallery']";
    public boolean isHeaderVisible(){
        return elementExists(Gallery_Header);
    }
}
