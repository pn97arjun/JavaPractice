package com.java.palindrome;

import org.testng.annotations.Test;

public class palindromNumber {
    @Test
    public void palinNo()
    {
        int sum=0,r;
        int n=454,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palin");
    }
}
