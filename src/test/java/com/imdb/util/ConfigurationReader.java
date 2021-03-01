package com.imdb.util;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties= new Properties();

    static{
        try {
            FileInputStream file= new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        } catch (Exception e) {
            System.out.println("File is not found");

        }
    }

    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }
}
