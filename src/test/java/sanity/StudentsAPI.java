package sanity;

import extensions.APIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.APIFlows;

@Listeners(utilities.Listeners.class)
public class StudentsAPI extends CommonOps {

    @Test(description = "Test 01: Get The Students List")
    @Description("This Test Verify List Property")
    public void test01_verifyList(){
       Verifications.verifyText(APIFlows.getProperty("[99].firstName"), "Oscar");
    }

    @Test(description = "Test 02: Add Student And Verify")
    @Description("This Test Adds a Student And Verify it")
    public void test02_addStudentAndVerify(){
        APIFlows.postStudent("Yuval", "Abdu", "yuvalabdu@gmail.com", "Financial Analysis");
        Verifications.verifyText(APIFlows.getProperty("[100].firstName"), "Yuval");
    }

    @Test(description = "Test 03: Update Student And Verify")
    @Description("This Test Updates a Student And Verify it")
    public void test03_updateStudentAndVerify(){
        String id = APIFlows.getProperty("[100].id");
        APIFlows.updateStudent("Yuval", "Abdu", "yuvalabdu@gmail.com", "Medicine!", id);
        Verifications.verifyText(APIFlows.getProperty("[100].programme"), "Medicine!");
    }

    @Test(description = "Test 04: Delete Student And Verify")
    @Description("This Test Deletes a Student And Verify it")
    public void test04_deleteStudentAndVerify(){
        //Verifications.existingNumberOfElement(APIActions.creatingList("id"), 101);
        String ID = APIFlows.getProperty("[100].id");
        APIFlows.deleteStudent(ID);
        APIActions.get("student/list");
        Verifications.existingNumberOfElement(APIActions.creatingList("firstName"), 100);
    }
}
