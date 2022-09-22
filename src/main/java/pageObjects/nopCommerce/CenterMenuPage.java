package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CenterMenuPage {
    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[1]")
    public WebElement btn_Computers;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[2]")
    public WebElement btn_Electronics;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[3]")
    public WebElement btn_Apparel;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[4]")
    public WebElement btn_DigitalDownload;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[5]")
    public WebElement btn_Books;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[6]")
    public WebElement btn_Jewelry;

    @FindBy(how = How.XPATH,using ="//div[@class='header-menu']/ul/li[7]")
    public WebElement btn_GiftCards;

}
