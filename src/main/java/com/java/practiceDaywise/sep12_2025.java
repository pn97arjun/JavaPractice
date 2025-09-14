package com.java.practiceDaywise;

import org.testng.annotations.Test;

public class sep12_2025 {
    @Test
    public void palinsep12()
    {
        int n=454,r=0,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palin "+sum);
        else
            System.out.println("Not a Palin"+sum);

    }
    @Test
    public void fibboSep12()
    {
        int f1=0,f2=1,f3=0,n=10;
        System.out.println("f1: "+f1);
        System.out.println("f2: "+f2);
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            System.out.println("f3: "+f3);
            f1=f2;
            f2=f3;
        }
    }
    @Test
    public void rverseSt()
    {
        String st="Test Automation";
        String r=" ";
        for(int i=st.length()-1;i>=0;i--)
        {
            r+=st.charAt(i);
        }
        System.out.println(r);
    }
    @Test
    public void reverseEle()
    {
        int[] arr=new int[]{1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+ " ");
        }
    }
    @Test
    public void duplielene12sep()
    {
        int[] arr=new int[]{1,2,2,3,3,4};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("dupli"+arr[j]);
                }
            }
        }
    }
    @Test
    public void swapNOSep12()
    {
        int a=10,b=5;
        a=a+b; //15
        b=a-b; //10
        a=a-b;
        System.out.println(a+" "+b);
    }
    @Test
    public void swapStSep12()
    {
        String a="how";
        String b="are";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);

    }
    @Test
    public void sortNoSep12()
    {
        int[] arr = new int[]{5, 4, 3, 2, 1, 7, 6};
        int temp;
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
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
    @Test
    public void primeNoSep12()
    {
        int num=12;
        int temp;
        Boolean prime=true;
        for(int i=2;i<num/2;i++)
        {
           temp=num%i;
           if(temp==0)
           {
               prime=false;
               break;
           }
        }
        if(prime)
            System.out.println("Prime");
        else
            System.out.println("Not a prime");

    }
}
