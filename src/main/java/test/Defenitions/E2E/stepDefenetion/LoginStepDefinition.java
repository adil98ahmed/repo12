package test.Defenitions.E2E.stepDefenetion;

import io.cucumber.java.en.Given;
import test.Defenitions.E2E.testDefenition.LoginTestDefinition;

public class LoginStepDefinition {
    LoginTestDefinition loginTestDefinition = new LoginTestDefinition();
    @Given("Login to page using {string},{string}")
    public void loginToPage(String userName, String password){
        loginTestDefinition.login(userName,password);
    }
}
