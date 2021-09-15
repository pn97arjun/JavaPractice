package com.java.sorting;

import org.testng.annotations.Test;

public class ReverseString {
    @Test
    public void reverseUsingChar()
    {
        String str="Reverse!";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    @Test
    public void reverseUsingStringBuilder()
    {
       StringBuilder str=new StringBuilder("Welcome");
       System.out.println(str.toString());
       System.out.println();
       System.out.println(str.reverse().toString());

    }
}
