package workflows;

import extensions.MobileActions;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class MobileFlows extends CommonOps {

    @Step("Business Flow: Using Loan Calculator ")
    public static void LoanClac(String Amount,String Rate,String Years,String Months,String ExtraMonthlyPayment ){
        MobileActions.tap(FinancialCalculatorsMainPage.LoanCalculator_btn);
        MobileActions.updateText(FinancialCalculatorsLoanClac.loanAmount_txt,Amount);
        MobileActions.updateText(FinancialCalculatorsLoanClac.interestRate_txt,Rate);
        MobileActions.updateText(FinancialCalculatorsLoanClac.loanYear_txt,Years);
        MobileActions.updateText(FinancialCalculatorsLoanClac.loanMonth_txt,Months);
        MobileActions.updateText(FinancialCalculatorsLoanClac.extraPerMonth_txt,ExtraMonthlyPayment);
        MobileActions.tap(FinancialCalculatorsLoanClac.Calculate_btn);

    }
}
