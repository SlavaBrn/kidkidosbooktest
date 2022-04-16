package Pages;

public class Resources extends BasePage{
    public static final String Video_Header = "//h1[text()= 'Fun and Educational Videos for Kids']";
    public boolean isHeaderVisible(){
        return elementExists(Video_Header);
    }

}
