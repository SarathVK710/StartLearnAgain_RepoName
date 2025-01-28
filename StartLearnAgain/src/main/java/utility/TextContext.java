package utility;

import org.openqa.selenium.devtools.v85.page.Page;

public class TextContext {

    public BrowserBase base;
    public PageObjectManager pageObjectManager;

        public TextContext(){
            base = new BrowserBase();
            pageObjectManager = new PageObjectManager(base.getDriver());
        }

}
