package test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Dataset;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  utilities.Driver;


public class Login_Test extends Driver {
    Login_Page l1 = new Login_Page();
    Home_Page h1 = new Home_Page();

    @BeforeMethod
    public void navigateDriver(){
        getLocalDriver().get(l1.page_url);
    }

    @AfterMethod
    public void screenshot(){
        l1.takeScreenShot("Login Page Screenshot: ");
    }

    @Test(dataProvider = "invalidData", dataProviderClass = Dataset.class)
    public void invalidloginAuth(String username, String password, String msg) throws InterruptedException {
        Thread.sleep(1500);
        l1.inputText(l1.username,username);
        Thread.sleep(1500);
        l1.inputText(l1.password, password);
        Thread.sleep(1500);
        l1.click(l1.login_button);
        Thread.sleep(1500);
        Assert.assertEquals(getLocalDriver().getCurrentUrl(), l1.page_url);
        Assert.assertEquals(l1.getElementText(l1.errorMsg), msg);
    }

    @Test(dataProvider = "validData", dataProviderClass = Dataset.class)
    public void validloginAuth(String username, String password) throws InterruptedException {
        Login_Page l1 = new Login_Page();
        Thread.sleep(1500);
        l1.inputText(l1.username,username);
        Thread.sleep(1500);
        l1.inputText(l1.password, password);
        Thread.sleep(1500);
        l1.click(l1.login_button);
        Thread.sleep(1500);
        Assert.assertEquals(getLocalDriver().getCurrentUrl(), h1.page_url);
    }



}
