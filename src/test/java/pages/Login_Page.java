package pages;

import org.openqa.selenium.By;

public class Login_Page extends Base_Page {
    public String page_url = "https://www.saucedemo.com/";
    public String page_title = "Swag Labs";
    public By heading = By.cssSelector(".login_logo");
    public By username = By.cssSelector("#user-name");
    public By password = By.cssSelector("#password");
    public By login_button = By.cssSelector("#login-button");
    public  By errorMsg = By.cssSelector("h3[data-test='error']");
}
