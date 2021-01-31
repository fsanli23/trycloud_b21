package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // this is
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // get Property
    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);

    }
}
