package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComputersMenuPage {
    @FindBy(how = How.XPATH,using ="//a[@href='/desktops']")
    public WebElement link_Desktop;

    @FindBy(how = How.XPATH,using ="//a[@href='/notebooks']")
    public WebElement link_Notebooks;

    @FindBy(how = How.XPATH,using ="//a[@href='/notebooks']")
    public WebElement link_Software;
}
