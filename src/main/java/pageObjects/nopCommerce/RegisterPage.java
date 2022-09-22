package pageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
    @FindBy(how = How.ID,using ="FirstName")
    public WebElement txt_FirstName;

    @FindBy(how = How.ID,using ="LastName")
    public WebElement txt_LastName;

    @FindBy(how = How.ID,using ="Email")
    public WebElement txt_Email;

    @FindBy(how = How.ID,using ="Password")
    public WebElement txt_Password;

    @FindBy(how = How.ID,using ="ConfirmPassword")
    public WebElement txt_ConfirmPassword;

    @FindBy(how = How.ID,using ="register-button")
    public WebElement btn_Register;

    @FindBy(how = How.CLASS_NAME,using ="result")
    public WebElement txt_Result;









}
