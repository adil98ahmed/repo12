package test.Defenitions.BE.testDefenition;

import com.google.gson.Gson;
import com.sun.net.httpserver.Headers;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonArray;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonValue;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonParser;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.bidi.network.Header;
import test.Helpers.JSONHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BECommonTestDefenition {

    private static Properties properties;
    private static Map<String, String> headersMap = new HashMap<String, String>();
    private static RequestSpecification requestSpecification;
    private static Response response;
    private String url;
    private String endPoint;
    private JSONObject jsonBody;
    private JsonObject jsonBodyForDelete = new JsonObject();
    private JsonArray jsonArray = new JsonArray();
    private Gson gson = new Gson();
    private static int id;
    JSONHelper jsonHelper = new JSONHelper();
    public static void setProperties (Properties properties1){
        properties=properties1;
    }
    public void setHeaders(){
        String token = properties.getProperty("token");
        headersMap.put("Cookie","orangehrm="+token);
        headersMap.put("content-type","application/json");
        headersMap.put("accept","application/json, text/plain, */*");
    }
    public void setUrlAndEndPoint(String urlPath, String endPointPath){
        url = properties.getProperty(urlPath);
        endPoint = properties.getProperty(endPointPath);
    }
    public void buildBody(String fileName){
        jsonBody = jsonHelper.readJson(fileName);
    }
    public void performXrequest(String method){
        RestAssured.baseURI = url;
        requestSpecification = RestAssured.given().headers(headersMap);
        if(method.equalsIgnoreCase("Post")){
            response = requestSpecification.body(gson.toJson(jsonBody)).post(endPoint);
        }
        else if(method.equalsIgnoreCase("Delete")){
            response = requestSpecification.body(jsonBody).delete(endPoint);
        }
    }
    public int getStatusCode(){
        System.out.println(response.getStatusCode());
        return response.getStatusCode();
    }
    public void storeIdOfUser(){
        id = Integer.parseInt(response.path("data.id").toString());
    }
    public void clearBody(){
        RestAssured.reset();
        requestSpecification = null;
        response = null;
        headersMap.clear();
        jsonBody=new JSONObject();
        jsonArray= new JsonArray();
    }

    JSONArray jsonArray1 = new JSONArray();
    public void buildBodyWithIdOfCreatedUser() {
        jsonArray.add(id);
        jsonBody.put("ids",jsonArray1);
    }
}
