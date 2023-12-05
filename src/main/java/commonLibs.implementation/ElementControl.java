package commonLibs.implementation;

import org.opena.selenium.WebDriver;

public class ElementControl {

    WebDriver driver;

    public ElementControl (WebDriver driver){
        this.driver = driver;
    }

    public void clickElement (WebElement element){
        element.click();
    }

    public void clear(WebElement element){
        element.clear();
    }

    public void setText(WebElement element){
        element.sendKeys(text);
    }

    public boolean isEnable(WebElement element){
        return element.isEnable();
    }

    public void isDisplayed(WebElement element){
        return element.isDisplayed()
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }

    public void selectViaVisibleText (WebElement element, String text){
        Select selDropdown = new Select(element);

        selDropdown.selectByVisibleText(text);
    }
}