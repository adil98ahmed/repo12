package test.stepDefenetion;

import configSetup.ConfigurationsHnadling;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import test.Helpers.Driver;

public class MyHooks {
    @Before
    public void startDriver(){
        ConfigurationsHnadling.initializeOfConfiguration();
        if(ConfigurationsHnadling.getProperties().get("browser").toString().equalsIgnoreCase("Chrome")){
            String url = ConfigurationsHnadling.getProperties().get("targetUrl").toString();
            String driverPath = ConfigurationsHnadling.getProperties().get("driverPath").toString();
            System.out.println("##"+url );
            System.out.println("##"+driverPath );
            Driver.startChromeDriver(url,driverPath);
        }
    }
    @After
    public static void closeDriver(){
        Driver.closeDriver();
    }
}
