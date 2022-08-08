package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Add New Task To The List")
    public static void addNewTask(String taskName){
        UIActions.updateText(todoMain.txt_createTask, taskName);
        UIActions.insertKey(todoMain.txt_createTask, Keys.RETURN);
    }

    @Step("Count And Return Number Of Tasks In List")
    public static int getNumberOfTasks(){
        return todoMain.list_task.size();
    }

    @Step("Empty Lists From Tasks")
    public static void emptyList(){
        for (int i = 0; i < getNumberOfTasks(); i++){
            UIActions.mouseHover(todoMain.btn_x);
        }
    }
}
