package pages;

import static utilities.Driver.getLocalDriver;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.ByteArrayInputStream;

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

    public Boolean elementVisible(By locator){
        try {
            return  getElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void takeScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getLocalDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
