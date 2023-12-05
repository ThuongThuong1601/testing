package test.java.com.guru99.test;

public class BaseTests {

    CommonDriver cmnDriver;
    String url;

    WebDriver driver;

    @BeforeClass
    public void setup(){
        url = "https://demo.guru99.com/v4";

        cmnDriver = new CommonDriver("chrome");

        driver = cmnDriver.getDriver();
        
        cmnDriver.navigateToURL(url);
    }

    @AfterClass
    public void tearDown(){
        cmnDriver.closeAllBroswer();
    }
    
}
