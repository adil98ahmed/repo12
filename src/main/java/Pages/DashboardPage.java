package Pages;

import org.openqa.selenium.By;

public class DashboardPage extends PageObject{
    private static final By adminTab = By.xpath("//span[contains(string(),\"Admin\")]");

    public void clickOnAdminTab(){
        clickOn(adminTab);
    }
}
