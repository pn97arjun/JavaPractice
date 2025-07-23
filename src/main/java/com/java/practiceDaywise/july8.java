package com.java.practiceDaywise;

import org.testng.annotations.Test;

public class july8 {

    @Test
    public void duplicateElem()
    {
        int[] arr=new int[]{5,3,3,2,1};

           for(int i=0;i<arr.length;i++)
           {
               for (int j = i + 1; j < arr.length; j++) {
                   if (arr[i] == arr[j])
                       System.out.println(arr[j]);
               }
           }
    }
}
