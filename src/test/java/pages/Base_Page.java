package pages;

import static utilities.Driver.getLocalDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base_Page {
    public WebElement getElement(By locator){
        return getLocalDriver().findElement(locator);
    }
    public void click(By locator){
        getElement(locator).click();
    }
    public void inputText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }
}
