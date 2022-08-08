package workflows;

import extensions.APIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

    @Step("Business Flow: Get List Property")
    public static String getProperty(String jPath){
        response = APIActions.get("student/list");
        return APIActions.extractFromJSON(response, jPath);
    }

    @Step("Business Flow: Create New Student")
    public static void postStudent(String firstName, String lastName, String email, String programme) {
        params.put("firstName", firstName);
        params.put("lastName", lastName);
        params.put("email", email);
        params.put("programme", programme);
        APIActions.post(params, "student");
    }

    @Step("Business Flow: Update Existing Student")
    public static void updateStudent(String firstName, String lastName, String email, String programme, String id) {
        params.put("firstName", firstName);
        params.put("lastName", lastName);
        params.put("email", email);
        params.put("programme", programme);
        APIActions.put(params, "student/" + id);
    }

    @Step("Business Flow: Delete Existing Student")
    public static void deleteStudent(String id) {
        APIActions.delete(id);
    }
}
