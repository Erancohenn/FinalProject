package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.Element;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import java.util.List;

import static org.testng.AssertJUnit.*;


public class Verifications extends CommonOps {

    @Step("Verify Displayed Element")
    public static void verifyDisplayedElement(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Number Of Element")
    public static void numbersOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expected);
    }

    @Step("Verify visibility Of Elements (SoftAssertion)")
    public static void visibilityOfElements(List<WebElement> elems){
        for(WebElement elem : elems){
            softAssert.assertTrue(elem.isDisplayed(), "Sorry, " + elem.getText() + " not displayed!");
        }
        softAssert.assertAll("Some elements were not displayed!");
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName){
        try {
            screen.find(getData("ImageRepo") + expectedImageName +  ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Compering Image File" + findFailed);
            fail("Error Compering Image File" + findFailed);
        }
    }

    @Step("Verify Element Displayed")
    public static void existenceOfElement(WebElement massage){
        wait.until(ExpectedConditions.visibilityOf(massage));
        if (massage.isDisplayed()){
            System.out.println(massage.getText());
        }
        else {
            fail("Massage Not Displayed, Check The Error Massages");
        }
    }

    @Step("Verify Text with Text")
    public static void verifyText(String actual, String expected){
        assertEquals(actual, expected);
    }

    @Step("Verify Number Of Existing Elements")
    public static void existingNumberOfElement(List<String> APIList, int expected){
        assertEquals(APIList.size(), expected);
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int actual, int expected){
        assertEquals(actual, expected);
    }
}
