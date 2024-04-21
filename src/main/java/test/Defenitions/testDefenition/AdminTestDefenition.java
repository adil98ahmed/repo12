package test.Defenitions.testDefenition;

import Pages.AdminPage;

public class AdminTestDefenition {
    AdminPage adminPage = new AdminPage();
    public int getNumberOfRecords(){
        return adminPage.getNumberOfRecords();
    }

    public void searchWithUserName(String username) {
        adminPage.searchWithUserName(username);
    }

    public void deleteCreatedUser() {
        adminPage.clickOnResetButton();
        adminPage.storeRecordsNumber();
        adminPage.deleteCreatedUser();
    }

    public int getOldNumberOfRecords() {
        return adminPage.getOldNumberOfRecords();
    }
}
