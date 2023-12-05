package commonLibs.implemetation;

import org.opena.selenium.WebDriver;
import org.opena.selenium.chrome.ChromeDriver;
import org.opena.selenium.edge.EdgeDriver;

public class CommonDriver {

    private WebDriver driver;

    private int pageLoadTimeout;
    
    private int elemenDetectionTimeout;

    private String currentWorkingDirectory;

    CommonDriver(String broswerType) throws Exception {
        pageLoadTimeout = 10;

        elemenDetectionTimeout = 10;
        currentWorkingDirectory = System.getProperty("user.dir");

        if (broswerType.eualsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", currentWorkingDirectory + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (broswerType.eualsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", currentWorkingDirectory + "/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throws new Exception("Invalid Broswer Type" + broswerType);
        }

        driver.manage().window.maximize();

        driver.manage().deleteAllCookiess();
    }

    public void navigateToURL (String url) {

        driver.manage().timeouts.pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts.implicitlyWait (elemenDetectionTimeout, TimeUnit.SECONDS);

        driver.get(url)
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void setPageLoadTimeout (int pageLoadTimeout){
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public void setElementDetectionTimeout (int elemenDetectionTimeout){
        this.elemenDetectionTimeout = elemenDetectionTimeout;
    }

    public void closeAllBroswer(){
        driver.quit();
    }

    public String getTitleOfThePage(){
        return driver.getTitle();
    }
}
