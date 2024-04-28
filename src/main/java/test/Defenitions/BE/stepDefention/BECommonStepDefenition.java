package test.Defenitions.BE.stepDefention;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import test.Defenitions.BE.testDefenition.BECommonTestDefenition;
public class BECommonStepDefenition {
    BECommonTestDefenition beCommonTestDefenition=new BECommonTestDefenition();
    int statusCode;
    @Given("I have the uer credentials for user")
    public void iHaveTheUserCredentialsForUser(){
        beCommonTestDefenition.setHeaders();
    }
    @Given("I set url {string} and end point {string}")
    public void iHaveTheUserCredentialsForUser(String url,String endPoint){
        beCommonTestDefenition.setUrlAndEndPoint(url,endPoint);
    }
    @And("I get body for Api call from {string}")
    public void iGetBodyForApiCallFrom(String fileName){
        beCommonTestDefenition.buildBody(fileName);
    }
    @And("I perform {string} request")
    public void iPerformXreqest(String method){
        beCommonTestDefenition.performXrequest(method);
    }
    @Then("I verify that the status code is {string}")
    public void iVerifyThatTheStatusCodeIs(String statusCode){
        Assert.assertEquals(Integer.parseInt(statusCode),beCommonTestDefenition.getStatusCode());
    }
    @And("I store the id of created user")
    public void iStoreTheIdOfCreatedUser(){
        beCommonTestDefenition.storeIdOfUser();
    }
    @And("I clear All")
    public void iClearTheBody(){
        beCommonTestDefenition.clearBody();
    }
    @And("I build body with new ID")
    public void iBuildBodyWithNewId(){
        beCommonTestDefenition.buildBodyWithIdOfCreatedUser();
    }

}
