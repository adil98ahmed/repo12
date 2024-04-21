package Pages;

import org.openqa.selenium.By;

import java.util.Map;

public class AddUserPage extends PageObject {

    private String dropDownValue  = "//div[@role='listbox']/*[contains(string(),'%s')]";
    private String dropDown = "//label[contains(text(),\"%s\")]/../../div[2]/div/div/div";
    private static final By employeeNameField = By.xpath("//label[contains(text(),\"Employee Name\")]/../../div[2]/div/div/input");
    private static final By usernameField = By.xpath("//label[contains(text(),\"Username\")]/../../div[2]/input");
    private static final By passwordField = By.xpath("(//label[contains(text(),\"Password\")]/../../div[2]/input)[1]");
    private static final By confirmPasswordField = By.xpath("//label[contains(text(),\"Confirm Password\")]/../../div[2]/input");
    private static final By saveButton = By.xpath("//button[@type = 'submit']");
    private String employeeNameDropDownValue = "//div[@role = 'listbox']//*[contains(string(),'%s')]";



    public void addUser(Map<String, String> userDetails){
       fillUserRoleAndStatus("User Role",userDetails.get("User Role"));
       fillUserRoleAndStatus("Status",userDetails.get("Status"));
       fillEmployeeName(userDetails.get("Employee Name"));
       fillUserName(userDetails.get("Username"));
       fillPassword(userDetails.get("Password"));
       fillConfirmPassword(userDetails.get("Password"));
       clickOnSaveButton();
   }
   private void clickOnSaveButton(){
       clickOnAndWaitForDisappear(saveButton);
   }

    private void fillConfirmPassword(String password) {
       sendText(confirmPasswordField,password);
    }

    private void fillPassword(String password) {
        sendText(passwordField,password);
    }

    private void fillUserName(String username) {
        sendText(usernameField,username);
    }

    private void fillUserRoleAndStatus(String fieldName, String value){
       clickOn(By.xpath(dropDown.replace("%s",fieldName)));
       clickOn(By.xpath(dropDownValue.replace("%s",value)));
   }
    private void fillEmployeeName( String value) {
        sendText(employeeNameField,value);
        clickOn(By.xpath(employeeNameDropDownValue.replace("%s",value)));
    }



}
