package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.util.Scanner;

public class july_03_2025 {

    @Test
    public void palindromeJUly()
    {
        int n=454,sum=0,r=0,temp;
       temp=n;
       while(n>0)
       {
           r=n%10;
           sum=(sum*10)+r;
           n=n/10;
       }
        if(temp==sum) {
            System.out.println("Palindrome" + sum);
        }
        else {
            System.out.println("Not a Palindrome" + sum);
        }

    }
    @Test
    public void fiboJuly()
    {
        int f1=0,f2=1,f3=0;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=0;i<=10;i++)
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }

    }
    @Test
    public void reverseStJuly()
    {
        String s="malayalam";
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println(r);
    }
    @Test
    public void isprimeJuly()
    {
        boolean isprime=true;
        int temp;
        int num=5;
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0) {
                isprime = false;
                break;
            }

        }
        if(isprime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}
