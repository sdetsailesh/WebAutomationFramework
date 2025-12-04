package org.example.utils;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigReader {
    public static Properties prop;

    public static void loadProperties() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
            System.out.println("Config file loaded successfully!");

        } catch (Exception e) {
            System.out.println("❌ Error loading config.properties");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        if (prop == null) {
            System.out.println("❌ ConfigReader.prop is NULL! loadProperties() was not called.");
            return null;
        }

        return prop.getProperty(key);

    }
}