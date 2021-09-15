package com.java.sorting;

import org.testng.annotations.Test;

public class Fibonacci {
    @Test
    public void fibo()
    {
        int f1=0,f2=1,f3=0,num=10,count=0;
        while(count<num)
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            count++;
        }

    }
}
