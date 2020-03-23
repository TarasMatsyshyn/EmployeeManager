package com.matsyshyn.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyParser {

    private static final String PROPERTY_FILE_PATH = "../application.properties";

    public static String getProperty(String key) {
        try (InputStream input = new FileInputStream(PROPERTY_FILE_PATH)) {
            Properties prop = new Properties();
            prop.load(input);

            return prop.getProperty(key);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

}
