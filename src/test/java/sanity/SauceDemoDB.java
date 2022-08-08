package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class SauceDemoDB extends CommonOps {

    @Test(description = "Test01 -Login to Sauce Demo with DB Credentials and Verify Header")
    @Description("This test Login to Sauce Demo with DB Credentials and Verify Header")
    public void test01_verifyHeader(){
        WebFlows.loginDB();
        Verifications.verifyDisplayedElement(sauceDemoMain.head_LogoHeader);
    }
}
