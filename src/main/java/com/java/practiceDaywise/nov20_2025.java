package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class nov20_2025 {

    @Test
    public  void palindromenov20()
    {
        int temp,sum=0,r=0,n=4145;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome"+sum);
        else
            System.out.println("Not a Palindrome"+sum);
    }
    @Test
    public void datenov20()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);
    }
    @Test
    public void swapno()
    {
        int a=5,b=10;
        a=a+b;//15
        b=a-b;//5
        a=a-b;//10
        System.out.println(a+" "+b);
    }
    @Test
    public void swapstring()
    {
        String a="how";
        String b="you";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }
    @Test
    public void whitespacest()
    {
        String str="how you i";
        String replstr=str.replaceAll("\\s","");
        System.out.println(replstr);
    }
    @Test
    public void fibbonov20()
    {
        int f1=0,f2=1,f3,n=10;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    @Test
    public void reverseSt()
    {
        String str="malayalam";
        String replstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            replstr+=str.charAt(i);
        }
        System.out.println(replstr);
    }
    @Test
    public void sortnonov20()
    {
        int[] arr=new int[]{4,2,1,3,5};
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
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    @Test
    public void reverseEle20nv()
    {
        int[] arr=new int[]{3,2,1,5,4};
        for(int i=arr.length-1;i>=0;i--)
            System.out.println(arr[i]);
    }
    @Test
    public void duplielearray(){
        int[] arr=new int[]{3,2,1,5,4,7,5,4};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
    @Test
    public void primenoTest()
    {
        int num=13;
        int temp;
        Boolean prime=true;
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0){
                prime=false;
                break;
            }
        }
        if(prime)
            System.out.println("prime"+num);
        else
            System.out.println("not prime"+num);
    }
    @Test
    public void sortwords()
    {
        String[] c={"zim","aus","bang","cat"};
        String a="";
        for(int i=0;i<c.length;i++)
        {
            for (int j=i+1;j<c.length;j++)
            {
                if(c[i].compareTo(c[j])>0)
                {
                    a=c[i];
                    c[i]=c[j];
                    c[j]=a;
                }
            }
        }
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }

}
