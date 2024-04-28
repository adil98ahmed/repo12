package test.Helpers;

import groovy.json.JsonParser;
import org.apache.groovy.json.internal.JsonFastParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class JSONHelper {

    public JSONObject readJson(String fileName){
        JSONParser jsonParser= new JSONParser();
        JSONObject jsonObject =new JSONObject();
        try {
            FileReader fileReader = new FileReader(".//.//.//.//Database//"+fileName);
            Object obj  =  jsonParser.parse(fileReader);
            JSONObject object = (JSONObject) obj;
            return object;

        }  catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
