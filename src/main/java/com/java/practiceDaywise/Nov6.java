package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class Nov6 {
    @Test
    public void propFile() throws Exception
    {
        Properties prop=new Properties();
        String filePath="/ConfigFile/config.properties";
        BufferedReader reader=new BufferedReader(new FileReader(filePath));
        prop.load(reader);
        String userNAme=prop.getProperty("url");
        System.out.println(userNAme);
        reader.close();
    }
}
