package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class SauceDemoWeb extends CommonOps {

    @Test(description = "Test01 - Verify Header")
    @Description("This test login and verify the header")
    public void test01_verifyHeader(){
        WebFlows.login(getData("loginUser"), getData("loginPassword"));
        Verifications.verifyDisplayedElement(sauceDemoMain.head_LogoHeader);
    }

    @Test(description = "Test02 - Verify Items")
    @Description("This test verify the items")
    public void test02_verifyItems(){
        WebFlows.login(getData("loginUser"), getData("loginPassword"));
        Verifications.numbersOfElements(sauceDemoMain.items, 6);
        UIActions.updateDropDown(sauceDemoHeader.btn_sortBy, "Name (Z to A)");
        Verifications.verifyTextInElement(sauceDemoMain.txt_bagName, "Sauce Labs Backpack");
        Verifications.verifyTextInElement(sauceDemoMain.txt_bagPrice, "$29.99");
    }

    @Test(description = "Test03 - Verify Items In Cart")
    @Description("This test put item in cart and verify the item there")
    public void test03_verifyItemInCart(){
        WebFlows.login(getData("loginUser"), getData("loginPassword"));
        WebFlows.addToCart(sauceDemoMain.btn_addToCartBag);
        UIActions.click(sauceDemoMain.link_cartPage);
        Verifications.verifyDisplayedElement(sauceDemoCart.txt_itemName);
        Verifications.verifyTextInElement(sauceDemoCart.txt_itemPrice, "$29.99");
    }

    @Test(description = "Test04 - Verify Social Media")
    @Description("This test verify all social media links appear in site (using SoftAssertion)")
    public void test04_verifySocialMedia() {
        WebFlows.login(getData("loginUser"), getData("loginPassword"));
        Verifications.visibilityOfElements(sauceDemoSocial.links_social);
    }


    // visual test
//    @Test(description = "Test05 - Verify Bike Light Image")
//    @Description("This test verify Bike Light Image Using Sikuli tool")
//    public void test05_BikeLightImage() {
//    WebFlows.login("standard_user", "secret_sauce");
//        Verifications.visualElement("SauceDemoBikeLightRUN");
//    }

    @Test (description = "Test06 - Verify Login Users", dataProvider = "data-provider-users",  dataProviderClass = utilities.ManageDDT.class)
    @Description("This test tries to login with different users name and verify the error massage")
    public void test06_verifyLoginUsers(String user, String password){
        WebFlows.loginByHuman(user, password);
        Verifications.existenceOfElement(sauceDemoLogin.txt_errorUser);
    }
}
