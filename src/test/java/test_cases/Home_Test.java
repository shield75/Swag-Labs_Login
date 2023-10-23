package test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Dataset;
import utilities.Driver;

public class Home_Test extends Driver {

    public String username = Dataset.username;
    public String password = Dataset.password;
    Login_Page l1 = new Login_Page();
    Home_Page h1 = new Home_Page();

    @BeforeMethod
    public void navigateDriver(){
        l1.doLogin(username,password);
    }

    @AfterMethod
    public void screenshot(){
        h1.takeScreenShot("Home Page Screenshot: ");
    }

    @Test
    public void cartTest() throws InterruptedException {
        Assert.assertFalse(h1.elementVisible(h1.cartCount));
        h1.click(h1.addItem);
        Thread.sleep(2000);
        Assert.assertEquals(h1.cartCount(),"1");
        h1.click(h1.addItem2);
        Thread.sleep(2000);
        Assert.assertEquals(h1.cartCount(),"2");
    }


}
