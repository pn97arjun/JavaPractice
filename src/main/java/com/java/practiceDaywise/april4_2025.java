package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class april4_2025 {

    @Test
    public void dateClass()
    {
        Date date =new Date();
        SimpleDateFormat sample=new SimpleDateFormat();
        String s =sample.format(date);
        System.out.println(s);

    }
    @Test
    public void reverseElement()
    {
        int[] arr=new int[]{54,41,6};
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
    @Test
    public void duplicateElements()
    {
        int[] arr=new int[]{8,8,5,5,4,4,3,2,2};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    @Test
    public void fiboo()
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
    public void reverseST()
    {
        String s="mallu";
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.print(r);
    }
    @Test
    public void swapNO()
    {
        int a=10;
        int b=5;
        a=a+b;  //15
        b=a-b;  //5
        a=a-b;//10

        System.out.println(a+" "+b);



    }

    @Test
    public void swapST()
    {
        String a="how";
        String b="are";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }
    @Test
    public void reverseSTBuild()
    {
        StringBuilder s=new StringBuilder("output");
        System.out.println(s.reverse().toString());
    }
    @Test
    public void palindrome()
    {
        int r=0,sum=0,n=454,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palin"+sum);
        else
            System.out.println("not palin");

    }

    @Test
    public void sortNo()
    {
        int[] arr=new int[]{10,11,1,5,4,2,3,6,8,7,9};
        int temp=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    @Test
    public void sortWordsNew()
    {
        String[] a={"Canada","Aus","Belgium"};
        String c="";

        for (int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    c=a[j];
                    a[j]=a[i];
                    a[i]=c;
                }
            }
        }
        for (int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");

    }



}
