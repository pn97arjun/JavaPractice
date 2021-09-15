package com.java.practice;

import org.testng.annotations.Test;

public class SortNumberString {

    @Test
    public void sortNumber()
    {
        int[] arr=new int[]{7,4,8,1,3,9,2};
        int temp=0,i,j;
        System.out.println("Array");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);

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
        System.out.println("Sorted Array");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    @Test
    public void sortCharacters()
    {
        String[] c={"Japan","Zimbabwe","Australia"};
        String a="";

        for(int l=0;l<c.length;l++)
            System.out.println(c[l]);

        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(c[i].compareTo(c[j])<0)
                {
                    a=c[i];
                    c[i]=c[j];
                    c[j]=a;
                }
            }
        }
        System.out.println();
        for(int k=0;k<c.length;k++)
            System.out.println(c[k]);

    }
}
