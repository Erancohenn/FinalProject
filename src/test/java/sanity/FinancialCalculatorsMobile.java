package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class FinancialCalculatorsMobile extends CommonOps {

    @Test(description = "Test01 - Using Loan Calc & Verify ")
    @Description("This Test Using the loan calculator & Checking the result ")
    public void test01_LoanCalculator() {
        MobileFlows.LoanClac("1000","10","4","6","100");
        Verifications.verifyTextInElement(FinancialCalculatorsLoanClac.totalPayment_txt,"1,039.77");

    }


}
