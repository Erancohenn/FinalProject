package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.FinancialCalculators.LoanCalcPage;
import pageObjects.FinancialCalculators.MainMenuPage;
import pageObjects.nopCommerce.ComputersMenuPage;
import pageObjects.nopCommerce.LogInPage;
import pageObjects.nopCommerce.NotebooksPage;
import pageObjects.nopCommerce.RegisterPage;


public class ManagePages extends Base{
    /*
    #####################################################################################
     Method Name: initnopCommerce
     Method Description: This Method initializing the page objects of web
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initnopCommerce(){
        nopCommerceMain = PageFactory.initElements(driver,pageObjects.nopCommerce.MainPage.class);
        nopCommerceCenterMenu =PageFactory.initElements(driver,pageObjects.nopCommerce.CenterMenuPage.class);
        nopCommerceComputersPage=PageFactory.initElements(driver, ComputersMenuPage.class);
        nopCommerceNotebooksPage =PageFactory.initElements(driver, NotebooksPage.class);
        nopCommerceRegisterPage=PageFactory.initElements(driver, RegisterPage.class);
        nopCommerceLogInPage=PageFactory.initElements(driver, LogInPage.class);
    }


    /*
    #####################################################################################
     Method Name: initMortgageCalc
     Method Description: This Method initializing the page objects of mobile
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initFinancialCalculators(){
        FinancialCalculatorsMainPage = new MainMenuPage(mobileDriver);
        FinancialCalculatorsLoanClac= new LoanCalcPage(mobileDriver);
    }


    /*
    #####################################################################################
     Method Name: initToDo
     Method Description: This Method initializing the page objects of electron
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initToDo(){
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }


    /*
    #####################################################################################
     Method Name: initCalculator
     Method Description: This Method initializing the page objects of desktop
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initCalculator(){
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}
