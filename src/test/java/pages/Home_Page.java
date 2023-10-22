package pages;

import org.openqa.selenium.By;

public class Home_Page extends Base_Page {
    public String page_url = "https://www.saucedemo.com/inventory.html";
    public By heading = By.cssSelector(".title");
    public String heading_text = "Products";

}
