package com.java.practiceDaywise;

import org.testng.annotations.Test;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Oct13 {

    @Test
    public void datePg()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);
    }
    @Test
    public void whiteSp()
    {
        String str="How are you";
        String strOrg=str.replaceAll("\\s","");
        System.out.println(strOrg);
    }
    @Test
    public void fibboN()
    {
        int f1=0,f2=1,f3=0,num=10,count=0;
        System.out.print(f1+" "+f2);
        while (count<=num)
        {
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            count++;
        }
    }
    @Test
    public void reverseString()
    {
        String str="Reverse";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    @Test
    public void reveresUsingReverse()
    {
        StringBuilder str=new StringBuilder("Hello");
        System.out.println(str.toString());
        System.out.println(str.reverse().toString());
    }
    @Test
    public void sortNumberArray()
    {
        int[] arr=new int[]{5,9,4,1,2,6,3};
        int temp=0;
        for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println();
        for (int l=0;l<arr.length;l++)
            System.out.print(arr[l]);

    }
    @Test
    public void sortCharacter()
    {
        String[] a={"Zimababwe","Yethopia","China","Australia","Bangla"};
        String c="";

        for(int k=0;k<a.length;k++)
            System.out.println(a[k]);

        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])<0) //< for ascending
                {
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        for(int l=0;l<a.length;l++)
            System.out.println(a[l]);

    }
    @Test
    public void swapNo()
    {
        int a=10,b=5;
        System.out.println(a+" "+b);
        a=a+b; //15
        b=a-b; //10
        a=a-b; //5
        System.out.println(a+" "+b);
    }
    @Test
    public void duplicateCharacter()
    {
        String str1="Selenium Selenium";
        char[] str=str1.toCharArray();

        for(int i=0;i<str.length;i++)
        {
            int count=1;
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i]==str[j] && str[i]!=' ')
                {
                    count++;
                    str[j]='0';
                }
            }
            if(count>1 && str[i]!='0')
                System.out.println(str[i]+" "+count);
        }
    }
}
