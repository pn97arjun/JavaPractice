package com.java.sorting;

import org.testng.annotations.Test;

public class SortCharacter {

    @Test
    public void sortCharacter()
    {
        String[] a={"Zambia","Brunei","Australia","China"};
        String c="";

        System.out.println("Character:");

        for(int l=0;l<a.length;l++)
            System.out.println(a[l]);
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])<0)
                {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        System.out.println("Sorted: ");
        for(int k=0;k<a.length;k++)
            System.out.println(a[k]);

    }
}
