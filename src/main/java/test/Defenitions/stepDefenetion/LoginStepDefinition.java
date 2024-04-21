package test.Defenitions.stepDefenetion;

import io.cucumber.java.en.Given;
import test.Defenitions.testDefenition.LoginTestDefinition;

public class LoginStepDefinition {
    LoginTestDefinition loginTestDefinition = new LoginTestDefinition();
    @Given("Login to page using {string},{string}")
    public void loginToPage(String userName, String password){
        loginTestDefinition.login(userName,password);
    }
}
