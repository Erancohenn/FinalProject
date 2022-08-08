package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class MainPage {
    @FindBy(how = How.CLASS_NAME, using = "app_logo")
    public WebElement head_LogoHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='inventory_item'][6]/div[2]/div[2]/div")
    public WebElement txt_bagPrice;

    @FindBy(how = How.XPATH, using = "//div[@class='inventory_item'][6]/div[2]/div/a/div")
    public WebElement txt_bagName;

    @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
    public WebElement btn_addToCartBag;

    @FindBy(how = How.CLASS_NAME, using = "shopping_cart_link")
    public WebElement link_cartPage;

    @FindBy(how = How.XPATH, using = "//div[@class='inventory_item']")
    public List<WebElement> items;



}
