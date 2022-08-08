package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SocialPage {

    @FindBy(how = How.XPATH, using = "//ul/li")
    public List<WebElement> links_social;
}
