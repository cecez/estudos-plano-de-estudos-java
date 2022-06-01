package org.example;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static String getApiKey() throws Exception
    {
        InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties");

        if (input == null) {
            throw new FileNotFoundException("property file 'config.properties' not found in the classpath");
        }

        Properties prop = new Properties();
        prop.load(input);

        if (prop.getProperty("api.key") == null) {
            throw new Exception("property 'api.key' not found in the property file");
        }

        return prop.getProperty("api.key");
    }

}
