package org.restassureddemo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class JsonPayload {
    public static Properties prop;
   public static HashMap<String , String > map= new HashMap<String, String>();

    public static HashMap<String, String> readJsonPayload(){

        try {

            prop = new Properties();

            FileInputStream fls = new FileInputStream("C:\\Users\\DANISH\\IdeaProjects\\RestClient\\src\\main\\java\\org\\restassureddemo\\test\\config.properties");
            prop.load(fls);

          map.put("id", prop.getProperty("id"));
          map.put("name", prop.getProperty("name"));
          map.put("description", prop.getProperty("description"));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

         return map;

    }


}
