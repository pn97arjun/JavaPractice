package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Oct23 {
    @Test
    public void datePg()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);
    }
    @Test
    public void swapNo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter first no: ");
        //int a=sc.nextInt();
        int a=10;
        System.out.println();
        System.out.print("Enter second no: ");
        //int b=sc.nextInt();
        int b=5;

        a=a+b; //15
        b=a-b; //10
        a=a-b; //5

        System.out.println(a+" "+b);


    }
    @Test
    public void swapString()
    {
        String a="Hello";
        String b="World";

        System.out.println(a+" "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a+" "+b);


    }
    @Test
    public void whiteSpace()
    {
        String str="How are you";
        String orf=str.replaceAll("\\s","");
        System.out.println(orf);

    }
    @Test
    public void fibbo()
    {
        int f1=0,f2=1,f3=0,count=0,num=10;
        System.out.print(f1+" "+f2);
        while(count<=num)
        {
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            count++;
        }
    }
    @Test
    public void sumArrays()
    {
        int[] arr=new int[]{5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
    @Test
    public void palindrome()
    {
        int n=424,sum=0,r,temp;
        temp=n;
        while (n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("palin");
        else
            System.out.println("Not palin");
    }
    @Test
    public void reverseSt()
    {
        String st="Hello";
        String r="";
        for(int i=st.length()-1;i>=0;i--)
        {
            r=r+st.charAt(i);
        }
        System.out.println(r);
    }
    @Test
    public void sortNum()
    {
        int[] arr=new int[]{4,6,7,1,3,2,5};
        int temp=0;
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
        for(int k=0;k<arr.length;k++)
            System.out.println(arr[k]);
    }
    @Test
    public void sortWords()
    {
        String[] c={"Zam","Aus","Ban","WI"};
        String a="";
        for(int l=0;l<c.length;l++)
            System.out.print(c[l]+" ");
        System.out.println();
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i].compareTo(c[j])>0)
                {
                    a=c[i];
                    c[i]=c[j];
                    c[j]=a;
                }
            }
        }
        for(int l=0;l<c.length;l++)
            System.out.print(c[l]+" ");
    }
    @Test
    public void duplicateChar()
    {
        String a="selenium selenium";
        char[] c=a.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            int count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j] && c[j]!=' ')
                {
                    count++;
                    c[j]='0'; //clear revisted;

                }
            }
            if(count>1 && c[i]!='0')
                System.out.println(c[i]+" "+count);
        }
    }


}
