package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class nopCommerceWebDB extends CommonOps {


   @Test(description = "test01 -Register with DB")
   @Description("This test login do nopCommerce with DB credentials")
   public void test01_RegisterDB() {
        WebFlows.RegisterWithDB();
        Verifications.verifyRegister(nopCommerceRegisterPage.txt_Result);
        nopCommerceMain.btn_LogOut.click();
    }
}
