package com.java.swap;

import org.testng.annotations.Test;

public class swapString {
    @Test
    public void swapTwoString()
    {
        String a="Hello";
        String b="World";

        System.out.println(a+" "+b);

        a=a+b; //append

        b=a.substring(0,a.length()-b.length()); //store a in b

        a=a.substring(b.length()); //store b in a

        System.out.println(a+" "+b);


    }
}
