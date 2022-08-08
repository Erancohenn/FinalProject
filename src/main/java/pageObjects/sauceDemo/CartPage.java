package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
    @FindBy(how = How.CLASS_NAME, using = "inventory_item_price")
    public WebElement txt_itemPrice;

    @FindBy(how = How.CLASS_NAME, using = "inventory_item_name")
    public WebElement txt_itemName;
}
