package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Oct16 {
    @Test
    public void dateFormat()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YYYY");
        String strDate=formatter.format(date);
        System.out.println(strDate);

    }
    @Test
    public void whiteSpaceRemove()
    {
        String str="how are you";
        String strRes=str.replaceAll("\\s","");
        System.out.println(strRes);
    }
    @Test
    public void swapTwo()
    {
        int a=5,b=10;
        System.out.println(a+" "+b);
        a=a+b; //15
        b=a-b; //5
        a=a-b; //10
        System.out.println(a+" "+b);

    }
    @Test
    public void palindrome()
    {
        int r=0,n=454,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    @Test
    public void sumOfArray()
    {
        int[] arr=new int[]{10,20,30};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    @Test
    public void fibbo()
    {
        int f1=0,f2=1,f3=0,num=10,count=0;
        System.out.print(f1+" "+f2);
        while (count<num)
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
        String str="How old are you";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    @Test
    public void reverseWord()
    {
        String str="How old are you";
        String[] srStr=str.split("");
        String rev="";
        String revNew="";
        for(int i=srStr.length-1;i>=0;i--)
        {
            rev=rev+srStr[i];
        }
        System.out.println(rev);
        StringBuilder stringBuilder=new StringBuilder(rev);
        System.out.println(stringBuilder.reverse());
    }
    @Test
    public void sortArray()
    {
        int[] arr=new int[]{5,7,1,4,2,3,6};
        int temp=0;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
        System.out.println();
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
            System.out.print(arr[i]);
    }
    @Test
    public void sortCharacter()
    {
        String[] c={"Zambia","Austria","Chile","Bermuda"};
        String a="";
        System.out.println("Characters");
        for(int k=0;k<c.length;k++)
            System.out.print(c[k]+" ");

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
        for(int l=0;l<c.length;l++)
            System.out.print(c[l]+" ");
    }
    @Test
    public void duplicateCharacter()
    {
        String a="Selenium Selenium";
        char[] c=a.toCharArray();
       /* for(int l=0;l<c.length;l++)
            System.out.println(c[l]);*/

        for(int i=0;i<c.length;i++)
        {
            int count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j] && c[i]!=' ')
                {
                    count++;
                    c[j]='0'; //remove visited characters
                }
            }
            if(count>1 && c[i]!='0') {

                System.out.println(c[i] + " " + count);
            }
        }
    }


}
