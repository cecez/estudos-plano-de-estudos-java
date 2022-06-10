package org.example;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static String get(String key) throws Exception
    {
        InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties");

        if (input == null) {
            throw new FileNotFoundException("property file 'config.properties' not found in the classpath");
        }

        Properties prop = new Properties();
        prop.load(input);

        if (prop.getProperty(key) == null) {
            throw new Exception(String.format("property '%s' not found in the property file", key));
        }

        return prop.getProperty(key);
    }

}
