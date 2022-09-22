package sanity;

import extensions.ApiActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;

public class DummyAPI extends CommonOps{

    @Test(description = "Test 01: Get Employee Data")
    @Description("This test Verifies Employee Data")
    public void test01_getEmployeeDetails(){
        Verifications.verifyText(ApiFlows.getEmployeeProperty("data[0].employee_age"),"61");
    }

    @Test(description = "Test 02: Add Employee and Verify")
    @Description("This test adds Employee & Verify ")
    public void test02_addEmployeeAndVerify(){
        ApiFlows.postEmployee("Yuval","16000","22");
        Verifications.verifyText( ApiActions.extractFromJSON(response,"message"),"Successfully! Record has been added.");
    }

    @Test(description = "Test 03: Update Employee Data and Verify")
    @Description("This test Updates Employee & Verify ")
    public void test03_updateEmployeeAndVerify(){
        ApiFlows.updateEmployee("Yuval","16000","22","6");
        Verifications.verifyText( ApiActions.extractFromJSON(response,"message"),"Successfully! Record has been updated.");
    }

    @Test(description = "Test 04: Delete Employee Data and Verify")
    @Description("This test Deletes Employee & Verify ")
    public void test04_deleteEmployeeAndVerify() {
        ApiFlows.deleteEmployee("5");
        Verifications.verifyText(ApiActions.extractFromJSON(response, "message"), "Successfully! Record has been deleted");
    }
}

