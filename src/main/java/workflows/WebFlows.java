package workflows;

import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;


public class WebFlows extends CommonOps {

    @Step("Business Flow: Change The Currency")
    public static void ChangeTheCurrency(String Text){
        UIActions.updateDropDown(nopCommerceMain.Currency,Text);
    }

    @Step("Business Flow: Register")
    public static void Register(String FirstName,String LastName,String Email,String Password){
        UIActions.click(nopCommerceMain.btn_RegisterIcon);
        UIActions.updateText(nopCommerceRegisterPage.txt_FirstName,FirstName);
        UIActions.updateText(nopCommerceRegisterPage.txt_LastName,LastName);
        UIActions.updateText(nopCommerceRegisterPage.txt_Email,Email);
        UIActions.updateText(nopCommerceRegisterPage.txt_Password,Password);
        UIActions.updateText(nopCommerceRegisterPage.txt_ConfirmPassword,Password);
        UIActions.click(nopCommerceRegisterPage.btn_Register);
    }

    @Step("Business Flow: Login")
    public static void LogIn(String Email,String Password){
        UIActions.click(nopCommerceMain.btn_LogIn);
        UIActions.updateText(nopCommerceLogInPage.txt_Email,Email);
        UIActions.updateText(nopCommerceLogInPage.txt_Password,Password);
        UIActions.click(nopCommerceLogInPage.btn_Login);
    }
    @Step("Business Flow: Register with Database Credentials ")
    public static void RegisterWithDB(){
        String query ="SELECT name,surname,email,password FROM NewUsers WHERE id='1'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.click(nopCommerceMain.btn_RegisterIcon);
        UIActions.updateText(nopCommerceRegisterPage.txt_FirstName,cred.get(0));
        UIActions.updateText(nopCommerceRegisterPage.txt_LastName,cred.get(1));
        UIActions.updateText(nopCommerceRegisterPage.txt_Email,cred.get(2));
        UIActions.updateText(nopCommerceRegisterPage.txt_Password,cred.get(3));
        UIActions.updateText(nopCommerceRegisterPage.txt_ConfirmPassword,cred.get(3));
        UIActions.click(nopCommerceRegisterPage.btn_Register);
    }


    @Step("Business Flow: Search & Verify Items")
    public static void SearchAndVerifyItems(String Item , String ShouldExist){
        UIActions.updateTextHuman(nopCommerceMain.txt_SearchBar, Item);
        if (ShouldExist.equalsIgnoreCase("exists"))
            Verifications.existenceOfElement(nopCommerceMain.SearchOptions);
        else if (ShouldExist.equalsIgnoreCase("not-exists"))
            Verifications.NonexistenceOfElement(nopCommerceMain.SearchOptions);
    }


}
