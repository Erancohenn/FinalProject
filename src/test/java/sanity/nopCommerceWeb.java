package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class nopCommerceWeb extends CommonOps {

    @Test (description = "Test01 - Change Currency ")
    @Description ("This Test Changes the currency")
    public void test01_ChangeCurrency() {
        WebFlows.ChangeTheCurrency("Euro");
        Verifications.VerifyCurrencyChance(nopCommerceMain.product_price,"€");
    }


    @Test (description = "Test02 - Verify Text In Element ")
    @Description ("This Test Verifies the Text IN Elements")
    public void test02_Verify() {

        Verifications.verifyTextInElement(nopCommerceMain.ShoppingCart, "Shopping cart");
        Verifications.verifyTextInElement(nopCommerceCenterMenu.btn_Computers, "Computers");
    }


  @Test (description = "Test03 - Number Of Items ")
   @Description ("This Test Verifies The number of Elements")
  public void test03_ItemNum() {
       UIActions.mouseHoverElements(nopCommerceCenterMenu.btn_Computers,nopCommerceComputersPage.link_Notebooks);
       Verifications.numberOfItems(nopCommerceNotebooksPage.Items,6);
   }


 @Test (description = "Test04 - Register ")
 @Description ("This Test makes a Register")
  public void test04_Register() {
        WebFlows.Register("Yariv","Yaniv","YarivYaniv@Gmail.com","YarivYaniv");
       Verifications.verifyRegister(nopCommerceRegisterPage.txt_Result);
        nopCommerceMain.btn_LogOut.click();
   }

   @Test (description = "Test05 - LogIn ")
   @Description ("This Test Makes a LogIN")
   public void test05_LogIn(){
            WebFlows.LogIn("YarivYaniv@Gmail.com","YarivYaniv");
       Verifications.verifyLogIn(nopCommerceMain.btn_LogOut);
   }


   @Test (description = "Test06 - Verify Center Menu ")
    @Description ("This Test Verifies The Center Menu")
    public void test06_VerifyCenterMenu(){
      Verifications.visibilityOfElements(nopCommerceMain.CenterMenu);
  }

   @Test (description = "Test07 - Verify Logo Image ")
    @Description ("This Test Verifies The Logo Icon Using Sikuli tool")
    public void test07_VerifyLogoImage(){
        Verifications.visualElement("nopCommerce_Logo");
    }

   @Test (description = "Test08 - Search Items",dataProvider ="data-provider-items",dataProviderClass = utilities.ManageDDT.class)
   @Description ("This Test Searches items & Verifies using DDT")
    public void test08_SearchItems(String Item,String ShouldExist){
      WebFlows.SearchAndVerifyItems(Item, ShouldExist);
   }






}
