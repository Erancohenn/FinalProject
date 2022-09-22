package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy (how = How.CLASS_NAME,using ="header-logo")
    public WebElement HeaderLogo;

    @FindBy (how = How.ID, using = "customerCurrency")
    public WebElement Currency;

    @FindBy(how = How.CLASS_NAME, using = "cart-label")
    public WebElement ShoppingCart;

    @FindBy(how = How.CLASS_NAME, using = "ico-register")
    public WebElement btn_RegisterIcon;

    @FindBy(how = How.CLASS_NAME, using = "ico-login")
    public WebElement btn_LogIn;

    @FindBy(how = How.CLASS_NAME, using = "ico-logout")
    public WebElement btn_LogOut;

    @FindBy(how = How.XPATH, using = "//div[@class='prices']/span")
    public WebElement product_price;

    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li")
    public List<WebElement> CenterMenu;

    @FindBy(how = How.ID, using = "small-searchterms")
    public WebElement txt_SearchBar;

    @FindBy(how = How.XPATH, using = "//li[@class ='ui-menu-item']")
    public List<WebElement> SearchOptions;













}
