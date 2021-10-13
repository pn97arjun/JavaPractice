package com.java.array;

import org.testng.annotations.Test;

public class ArrayPrograms {

    @Test
    public void sumofArray()
    {
        int[] arr=new int[]{10,20,30,40};
        int sum=0;
        for(int i=0;i< arr.length;i++)
            System.out.println(arr[i]);
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
