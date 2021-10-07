package com.java.sorting;


import org.testng.annotations.Test;

public class SortNumberUsingArray {

    @Test
    public void sortArray() {
        int[] arr = new int[]{5, 4, 3, 6, 1, 2};
        int i, j, temp = 0;
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }
        }
        System.out.println("Sorted array: ");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    @Test(priority =1)
    public void sortCharacterWords()
    {
        String[] a={"Zimbabwe","USA","Japan","Australia","India"};
        String c="";
        for(int k=0;k<a.length;k++)
            System.out.println(a[k]);
        System.out.println();
        for(int i=0;i<a.length;i++)
        {

            for(int j=0;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])<0)
                {
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;

                }
            }

        }
        System.out.println();
        for(int l=0;l<a.length;l++)
            System.out.println(a[l]);
    }

}