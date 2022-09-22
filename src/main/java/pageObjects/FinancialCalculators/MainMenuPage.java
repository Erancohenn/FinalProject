package pageObjects.FinancialCalculators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainMenuPage {
    private AppiumDriver mobileDriver;

    public MainMenuPage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath = "//*[@id='mainGrid']/*[3]")
    public AndroidElement LoanCalculator_btn;
}
