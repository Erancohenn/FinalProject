package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.Element;
import org.sikuli.script.FindFailed;
import org.testng.AssertJUnit;
import utilities.CommonOps;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import static org.testng.AssertJUnit.*;


public class Verifications extends CommonOps {
    @Step("Verify Currency Change")
    public static void VerifyCurrencyChance(WebElement elem, String currencyType){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.getText().contains(currencyType));
    }

    @Step("Verify Text in Element")
    public static void verifyTextInElement(WebElement elem,String Expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),Expected);
    }

    @Step("Verify Number of Items")
    public static void numberOfItems(List<WebElement> elems, int ExpectedNum){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),ExpectedNum);
    }

    @Step("Verify Register")
    public static void verifyRegister(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),"Your registration completed");
    }

    @Step("Verify Login")
    public static void verifyLogIn(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Visibility of Elements (soft-assertions)")
    public static void visibilityOfElements(List<WebElement> elems) {
        for(WebElement elem : elems){
            softAssert.assertTrue(elem.isDisplayed());
        }
        softAssert.assertAll();
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName){
        try {
            screen.find(getData("ImageRepo") + expectedImageName +".png");
        } catch (FindFailed e) {
            System.out.println("Error Comparing Image File: " + e);
            fail("Error Comparing Image File: " + e);
        }
    }

    @Step("Verify Element Displayed")
    public static void existenceOfElement(List<WebElement> elements){
        assertTrue(elements.size() > 0);
    }

    @Step("Verify Element Not Displayed")
    public static void NonexistenceOfElement(List<WebElement> elements){
        assertFalse(elements.size() > 0);
    }

    @Step("Verify Text With Text")
    public static void verifyText(String Actual, String Expected){
        assertEquals(Actual,Expected);
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int actual, int expected){
        AssertJUnit.assertEquals(actual, expected);
    }
}