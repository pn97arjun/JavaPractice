package com.java.propertyFile;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class PropLoadClass {
    @Test
    public void propLoad()
    {

        try{
            Properties prop=new Properties();
            String propPth="./ConfigFile/config.properties";
            BufferedReader reader =new BufferedReader(new FileReader(propPth));
            prop.load(reader);
            String url=prop.getProperty("url");
            System.out.println(url);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
