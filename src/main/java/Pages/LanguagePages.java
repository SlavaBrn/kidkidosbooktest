package Pages;

public class LanguagePages extends BasePage{
    public static final String Blog_Header = "//h1[text()= 'Blog']";
    public boolean isHeaderVisible(){
        return elementExists(Blog_Header);
    }
    public static final String French_Header = "//h1[text()= 'French - Français']";
    public boolean isFrenchVisible(){
        return elementExists(French_Header);
    }
    public static final String Mandarin_Header = "//h1[text()= 'Mandarin Chinese - 中文']";
    public boolean isMandarinHeaderVisible(){
        return elementExists(Mandarin_Header);
    }
}

