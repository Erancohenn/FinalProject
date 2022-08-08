package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage {
    @FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
    public WebElement btn_sortBy;

}
