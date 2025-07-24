package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class july23_2025 {

    @Test
    public void palindrome23July()
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
            System.out.println("palindrome"+temp+" "+sum);
        else
            System.out.println("Not a palindrome"+temp+" "+sum);
    }
    @Test
    public void fiboo23July()
    {
        int f1=0,f2=1,f3=0,n=10;
        System.out.println("f1 "+f1);
        System.out.println("f2 "+f2);
        for(int i=1;i<=n;i++)
        {
            f3=f1+f2;
            System.out.println(f3+ " ");
            f1=f2;
            f2=f3;

        }
    }
    @Test
    public void reverseSt2jul232025()
    {
        String s="Test Automation";
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        System.out.println("Reversed string: "+r);
    }
    @Test
    public void revereElemenets23july()
    {
        int[] arr=new int[]{1,2,3,4,4,6};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    @Test
    public void dupliElements23jul()
    {
        int[] arr=new int[]{11,1,1,2,2,5,6,6};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }

    }
    @Test
    public void dateClass23july()
    {

        Date date=new Date();
        SimpleDateFormat simple=new SimpleDateFormat();
        String s=simple.format(date);
        System.out.println(s);

    }
    @Test
    public void swapNo23july()
    {
        int a=10,b=5;
        System.out.println(a+" "+b);
        a=a+b;//a:15
        b=a-b;//b:10
        a=a-b;//a:5
        System.out.println(a+" "+b);
    }
    @Test
    public void swapString23july()
    {
        String a="How";
        String b="are";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.print(a+" "+b);

    }
    @Test
    public void reverseStringBuilder23july()
    {
        StringBuilder st=new StringBuilder("Output");
        System.out.print(st.reverse().toString());
    }
    @Test
    public void sortNojuly23()
    {
        int[] arr=new int[]{5,4,3,2,1,7,6};
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
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    @Test
    public void sortWords23july()
    {
        String[] a={"Zimbawe","Australia","Belgium","Denmark","Canada"};
        String c="";
        for(int i=0;i<a.length;i++)
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
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }
    @Test
    public void primeNojuly23()
    {
        Boolean prime=true;
        int temp;
        int num=11;
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
            System.out.println("prime no");
        else
            System.out.println("Not a prime no");
    }
    @Test
    public void balastringReverse()
    {
        String str="Automation Test";

        String[] words=str.split(" ");
        StringBuilder reverseSentence=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            reverseSentence.append(words[i]);
            if(i>0)
            {
                reverseSentence.append(" ");
            }

        }

        System.out.print(reverseSentence.toString());

    }
    @Test
    public void reverseeachword()
    {
        String sentence="Test Automation";
        char[] chars = sentence.toCharArray(); // Convert the string to a character array
        int start = 0; // Starting index of the current word

        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') { // Found a word boundary or end of string
                int left = start; // Left pointer for reversing the word
                int right = i - 1; // Right pointer for reversing the word

                while (left < right) {
                    char temp = chars[left]; // Swap characters
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                start = i + 1; // Move the starting index to the beginning of the next word
            }
        }
        System.out.print(chars);
    }


}
