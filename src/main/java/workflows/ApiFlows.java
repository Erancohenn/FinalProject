package workflows;

import extensions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ApiFlows extends CommonOps {

    @Step("Business Flow: Get Employee Property")
    public static String getEmployeeProperty(String jPath){
        response = ApiActions.get("employees/");
        return ApiActions.extractFromJSON(response,jPath);
    }

    @Step("Business Flow: Create New User")
    public static void postEmployee(String name,String salary,String age){
        params.put("name", name);
        params.put("salary", salary);
        params.put("age", age);
        ApiActions.post(params,"create");
    }

    @Step("Business Flow: Update Exiting Employee")
    public static void updateEmployee(String name,String salary,String age, String num) {
        params.put("name", name);
        params.put("salary", salary);
        params.put("age", age);
        ApiActions.put(params, "update/" + num);
    }

    @Step("Business Flow: Delete Exiting Employee")
    public static void deleteEmployee(String id) {
        ApiActions.delete(id);
    }


}
