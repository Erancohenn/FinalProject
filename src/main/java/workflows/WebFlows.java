package workflows;

import extensions.DBActions;
import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.List;


public class WebFlows extends CommonOps {

    @Step("Business Flow: Login")
    public static void login(String username, String password){
        UIActions.updateText(sauceDemoLogin.txt_username, username);
        UIActions.updateText(sauceDemoLogin.txt_password, password);
        UIActions.click(sauceDemoLogin.btn_login);
    }

    @Step("Business Flow: Add To Cart")
    public static void addToCart(WebElement button){
        UIActions.click(button);
    }

    @Step("Business Flow: Login Slowly Like Human")
    public static void loginByHuman(String username, String password){
        UIActions.updateTextHuman(sauceDemoLogin.txt_username, username);
        UIActions.updateTextHuman(sauceDemoLogin.txt_password, password);
        UIActions.click(sauceDemoLogin.btn_login);
    }

    @Step("Business Flow: Login with Data Base Credentials")
    public static void loginDB(){
        String query = "SELECT Name, Password FROM Employees WHERE Id = '1'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(sauceDemoLogin.txt_username, cred.get(0));
        UIActions.updateText(sauceDemoLogin.txt_password, cred.get(1));
        UIActions.click(sauceDemoLogin.btn_login);
    }

}
