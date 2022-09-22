package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class NotebooksPage {
    @FindBy(how = How.CLASS_NAME,using ="page-title")
    public WebElement PageTitle;

    @FindBy(how = How.XPATH,using ="//div[@class='item-grid']/div")
    public List<WebElement> Items;

    @FindBy(how = How.XPATH,using ="//div[@class=prices]/span[1]")
    public WebElement MacbookPrice;

}
