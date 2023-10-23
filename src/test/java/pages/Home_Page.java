package pages;

import org.openqa.selenium.By;

public class Home_Page extends Base_Page {
    public String page_url = "https://www.saucedemo.com/inventory.html";
    public By heading = By.cssSelector(".title");
    public String heading_text = "Products";
    public By addItem = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    public By addItem2 = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    public By cartCount = By.cssSelector(".shopping_cart_badge");

    public String cartCount(){
        return getElementText(cartCount);
    }
}
