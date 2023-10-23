package pages;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.Dataset;
import static utilities.Driver.getLocalDriver;

public class Login_Page extends Base_Page {
    public String page_url = "https://www.saucedemo.com/";
    public String page_title = "Swag Labs";
    public By heading = By.cssSelector(".login_logo");
    public By username = By.cssSelector("#user-name");
    public By password = By.cssSelector("#password");
    public By login_button = By.cssSelector("#login-button");
    public  By errorMsg = By.cssSelector("h3[data-test='error']");

    public void doLogin(String username1, String password1)  {
        getLocalDriver().get(page_url);
        inputText(username,username1);
        inputText(password,password1);
        click(login_button);
    }
}
