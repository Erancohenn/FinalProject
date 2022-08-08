package utilities;

import org.openqa.selenium.support.PageFactory;


public class ManagePages extends Base{
    /*
    #####################################################################################
     Method Name: initSauceDemo
     Method Description: This Method initializing the page objects of web
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initSauceDemo(){
        sauceDemoLogin = PageFactory.initElements(driver, pageObjects.sauceDemo.LoginPage.class);
        sauceDemoMain = PageFactory.initElements(driver, pageObjects.sauceDemo.MainPage.class);
        sauceDemoCart = PageFactory.initElements(driver, pageObjects.sauceDemo.CartPage.class);
        sauceDemoHeader = PageFactory.initElements(driver, pageObjects.sauceDemo.HeaderPage.class);
        sauceDemoSocial = PageFactory.initElements(driver, pageObjects.sauceDemo.SocialPage.class);
    }


    /*
    #####################################################################################
     Method Name: initMortgageCalc
     Method Description: This Method initializing the page objects of mobile
     Method Parameters: --
     Method Return: --
     #####################################################################################
     */
    public static void initMortgageCalc(){
        mortgageMain = new pageObjects.mortgageCalc.MainPage(mobileDriver);
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
