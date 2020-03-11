package org.restassureddemo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class JsonPayloadSerialization {

    public Properties prop;


    public Properties readJsonPayload() {

        try {

            prop = new Properties();

            FileInputStream fls = new FileInputStream("C:\\Users\\DANISH\\IdeaProjects\\RestClient\\src\\main\\java\\org\\restassureddemo\\test\\config.properties");
            prop.load(fls);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }

}
