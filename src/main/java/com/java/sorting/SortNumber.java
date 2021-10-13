package com.java.sorting;

import org.testng.annotations.Test;

public class SortNumber {

    @Test
    public void sortNumber()
    {
        int i,j,temp=0;
        int[] arr=new int[]{5,2,6,3,7,1,4};
        System.out.println("Numbers: ");
        for(int k=0;k<arr.length;k++)
        System.out.println(arr[k]);

        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted: ");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }



}
