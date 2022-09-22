package pageObjects.FinancialCalculators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoanCalcPage {
    private AppiumDriver mobileDriver;

    public LoanCalcPage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(id ="loanAmount")
    public AndroidElement loanAmount_txt;

    @AndroidFindBy(id ="interestRate")
    public AndroidElement interestRate_txt;

    @AndroidFindBy(id ="loanYear")
    public AndroidElement loanYear_txt;

    @AndroidFindBy(id ="loanMonth")
    public AndroidElement loanMonth_txt;

    @AndroidFindBy(id ="extraPerMonth")
    public AndroidElement extraPerMonth_txt;

    @AndroidFindBy(id ="calc")
    public AndroidElement Calculate_btn;

    @AndroidFindBy(id ="monthlyPayment")
    public AndroidElement MonthlyPayment_txt;

    @AndroidFindBy(id ="totalPayment")
    public AndroidElement totalPayment_txt;





}
