package test.Defenitions.BE.Hooks;

import configSetup.ConfigurationsHnadling;
import io.cucumber.java.Before;
import test.Defenitions.BE.testDefenition.BECommonTestDefenition;
import test.Helpers.Driver;

import java.util.Properties;

public class BEHOOKS {
    private static final String configPath = "configrations/configBE.properties";
    @Before
    public static void readConfigFile(){
        ConfigurationsHnadling.initializeOfConfiguration(configPath);
        BECommonTestDefenition.setProperties(ConfigurationsHnadling.getProperties());
    }
}
