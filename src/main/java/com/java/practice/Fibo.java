package com.java.practice;

import org.testng.annotations.Test;

public class Fibo {

    @Test
    public void fibonnaci()
    {
        int f1=0,f2=1,f3,count=0,num=10;
        System.out.println(f1+" "+f2);
        while (count<=num){
            f3=f1+f2;
            System.out.println(" "+f3);
            f2=f3;
            f1=f2;
            count++;

        }
    }
}
