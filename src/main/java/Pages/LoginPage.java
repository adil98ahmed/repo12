package Pages;

import org.openqa.selenium.By;

public class LoginPage extends PageObject{
    private static final By userNameTextField = By.xpath("//input[@name = 'username']");
    private static final By passwordTextField = By.xpath("//input[@name = 'password']");
    private static final By loginButton = By.xpath("//button[@type = 'submit']");

    public void enterUserName(String userName){
        sendText(userNameTextField, userName);
    }
    public void enterPassword(String password){
        sendText(passwordTextField,password);
    }
    public void clickOnLoginButton(){
        clickOn(loginButton);
    }
}
