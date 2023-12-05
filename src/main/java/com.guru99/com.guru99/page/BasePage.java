package main.java.com.guru99.page.page;

public class BasePage {

    public BasePage (WebDriver driver){
        this.driver = driver;

        elementControl = new ElementControl(driver);
    }
    
    
}
