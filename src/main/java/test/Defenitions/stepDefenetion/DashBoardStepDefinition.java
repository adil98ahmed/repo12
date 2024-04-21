package test.Defenitions.stepDefenetion;

import io.cucumber.java.en.When;
import test.Defenitions.testDefenition.DashboardTestDefinition;

public class DashBoardStepDefinition {
    DashboardTestDefinition dashboardTestDefinition = new DashboardTestDefinition();
    @When("I click on Admin tab")
    public void iClickOnAdminTab(){
        dashboardTestDefinition.clickOnAdminTab();
    }
}
