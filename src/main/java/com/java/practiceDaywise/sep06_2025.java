package com.java.practiceDaywise;

import org.testng.annotations.Test;

public class sep06_2025 {
    @Test
    public void palinsep05()
    {
        int n=454,r=0,sum=0,temp=0;
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
            System.out.println("Not a palindrome"+sum);
    }
    @Test
    public void fibosep06()
    {
        int f1=0,f2=1,f3=0,n=10;
        System.out.println("f1:"+f1);
        System.out.println("f2:"+f2);
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            System.out.println(" "+f3);
            f1=f2;
            f2=f3;
        }
    }
    @Test
    public void reverseStsep06()
    {
       String s="Test Automation";
       String r="";
       for(int i=s.length()-1;i>=0;i--)
       {
           r+=s.charAt(i);

       }
        System.out.print(r);
    }
    @Test
    public void reverseElem()
    {
        int[] arr=new int[]{1,2,3,4};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
    @Test
    public void dupliElements()
    {
        int[] arr=new int[]{1,1,2,3,3,4};
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println("DUpli"+arr[j]);
                }

            }
        }
    }
    @Test
    public void swapNo()
    {
        int a=10,b=5;
        a=a+b; //15
        b=a-b;//10
        a=a-b;//5
        System.out.print(a + " " + b);
    }
    @Test
    public void swapString()
    {
        String a = "How";
        String b = "are";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.print(a + " " + b);
    }
    @Test
    public void sortNo()
    {
        int[] arr = new int[]{5, 4, 3, 2, 1, 7, 6};
        int temp = 0;
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
            System.out.print(arr[i]+" ");
    }
    @Test
    public void prime()
    {
        Boolean prime=true;
        int num=13;
        int temp;
        for(int i=2;i<num/2;i++) {
            temp = num % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        if(prime)
            System.out.println("prime no");
        else
            System.out.println("Not a prime no");
    }
}
