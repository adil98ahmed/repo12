package test.stepDefenetion;

import io.cucumber.java.en.When;
import test.testDefenition.AdminTestDefenition;
import test.testDefenition.DashboardTestDefinition;

public class DashBoardStepDefinition {
    DashboardTestDefinition dashboardTestDefinition = new DashboardTestDefinition();
    @When("I click on Admin tab")
    public void iClickOnAdminTab(){
        dashboardTestDefinition.clickOnAdminTab();
    }
}
