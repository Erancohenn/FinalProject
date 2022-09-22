package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {

    @FindBy(how = How.ID,using ="Email")
    public WebElement txt_Email;

    @FindBy(how = How.ID,using ="Password")
    public WebElement txt_Password;

    @FindBy(how = How.XPATH,using ="//button[@class='button-1 login-button']")
    public WebElement btn_Login;



}
