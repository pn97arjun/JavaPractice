package com.java.sorting;

import org.testng.annotations.Test;

public class WhiteSpace {
    @Test
    public void replaceWhiteSpace()
    {
        String str="How are you";
        System.out.println(str);
        System.out.println();
        String str1=str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
