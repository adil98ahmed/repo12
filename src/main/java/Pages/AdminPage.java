package Pages;

import org.openqa.selenium.By;

public class AdminPage extends PageObject{
    private static final By numberOfRecordsText = By.xpath("//span[contains(string(),\"Found\")]");
    private static final By addButton = By.xpath("//button[contains(string(),\"Add\")]");
    private static final By userNameSearchField = By.xpath("//label[contains(string(),\"Username\")]/../../div[2]/input");
    private static final By searchButton = By.xpath("//button[@type=\"submit\"]");
    private static final By resetButton = By.xpath("//button[contains(string(),'Reset')]");
    private static final By deleteIcon = By.xpath("//i[@class=\"oxd-icon bi-trash\"]/..");
    private static final By confirmDeleteButton = By.xpath("//i[@class=\"oxd-icon bi-trash oxd-button-icon\"]/..");
    private static int oldNumberOfRecords;



    public int getNumberOfRecords(){
        String numberOfRecordsAsString = getText(numberOfRecordsText).replaceAll("[A-Za-z,\\((.+?)\\)]","").trim();
        return Integer.parseInt(numberOfRecordsAsString);
    }

    public void clickOnAddButton(){
        clickOn(addButton);
    }
    public void clickOnSearchButton(){
        clickOn(searchButton);
    }

    public void searchWithUserName(String username) {
        sendText(userNameSearchField,username);
        clickOnSearchButton();
    }
    private void clickOnDeleteIcon(){
        clickOn(deleteIcon);
    }
    private void clickOnConfirmDeleteButton(){
        clickOn(confirmDeleteButton);
    }
    public void clickOnResetButton(){
        clickOn(resetButton);
    }
    public void deleteCreatedUser() {
        clickOnDeleteIcon();
        clickOnConfirmDeleteButton();
        clickOnResetButton();
    }

    public void storeRecordsNumber() {
        String recordNumbers = getText(numberOfRecordsText).replaceAll("[A-Za-z,\\((.+?)\\)]","").trim();
        oldNumberOfRecords = Integer.parseInt(recordNumbers);
    }
    public int getOldNumberOfRecords (){
        return oldNumberOfRecords;
    }
}
