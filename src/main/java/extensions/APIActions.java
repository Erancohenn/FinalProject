package extensions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

import java.util.List;

public class APIActions extends CommonOps {

    @Step ("Get Data From Server")
    public static Response get(String paramValues){
        response = httpRequest.get(paramValues);
        response.prettyPrint();
        return response;
    }

    @Step ("Extract Value From JSON Format")
    public static String extractFromJSON(Response response, String path){
       jp = response.jsonPath();
       return jp.get(path).toString();
    }

    @Step ("Post Data To Server")
    public static void post(JSONObject params, String resource){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        response.prettyPrint();
    }

    @Step ("Update Data In Server")
    public static void put(JSONObject params, String resource){
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        response.prettyPrint();
    }

    @Step ("Delete Data From Server")
    public static void delete(String id){
        response = httpRequest.delete("student/" + id);
        response.prettyPrint();
    }

    @Step ("Creating List From The Server Data")
    public static List<String> creatingList(String path){
        jp = response.jsonPath();
        List<String> allStudents = jp.getList(path);
        return allStudents;
    }
}
