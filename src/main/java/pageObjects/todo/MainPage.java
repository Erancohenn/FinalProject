package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CSS, using = "input[placeholder='Create a task']")
    public WebElement txt_createTask;

    @FindBy(how = How.CLASS_NAME, using = "taskWrapper_2u8dN")
    public List<WebElement> list_task;

    @FindBy(how = How.CLASS_NAME, using = "destroy_19w1q")
    public WebElement btn_x;
}
