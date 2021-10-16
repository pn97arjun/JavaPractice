package com.java.sorting;

import org.testng.annotations.Test;

public class ReverseWords {
    @Test
    public void reverseWord()
    {
        String srcSTr="How are you";
        System.out.println("Source: "+srcSTr);
        String revStr="";
        String[] arrStr=srcSTr.split("\\s");

        for(int i= arrStr.length-1;i>=0;i--)
        {
            revStr=revStr+arrStr[i]+ " ";
        }
        System.out.println("Reverse: "+revStr);
    }
    @Test
    public void reverseEntire()
    {
        String srcSTr="How are you";
        System.out.println("Source: "+srcSTr);
        String revStr="";
        String[] arrStr=srcSTr.split("");
        for(int i=0;i<arrStr.length;i++)
            System.out.print(arrStr[i]);

        for(int i= arrStr.length-1;i>=0;i--)
        {
            revStr=revStr+arrStr[i];
        }
        System.out.println();
        System.out.println("Reverse: "+revStr);

    }
}
