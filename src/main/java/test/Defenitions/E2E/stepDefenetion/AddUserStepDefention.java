package test.Defenitions.E2E.stepDefenetion;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import test.Defenitions.E2E.testDefenition.AddUserTestDefinition;


public class AddUserStepDefention {
    AddUserTestDefinition addUserTestDefinition = new AddUserTestDefinition();
    @And("I add new user with data:")
    public void addNewUser(DataTable userDetailsTable){
        addUserTestDefinition.addUser(userDetailsTable);
    }
}
