package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class nov19_2025 {
 @Test
    public void palindromnov19()
 {
     int sum=0,n=1412,r;
     int temp;
     temp=n;
     while (n>0)
     {
         r=n%10;
         sum=(sum*10)+r;
         n=n/10;
     }
     if(temp==sum)
         System.out.println("Palindrome "+sum);
     else
         System.out.println("Not Palindrome "+sum);

 }
 @Test
    public void datenov19() throws Exception
 {
     Date date=new Date();
     SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
     String str=formatter.format(date);
     System.out.println(str);
 }
 @Test
    public void swapnonov19()
 {
     int a=5,b=10;
     a=a+b;//15
     b=a-b;//5
     a=a-b;
     System.out.println(a+" "+b);
 }
 @Test
    public void swapstrnov19()
 {
     String a="how";
     String b="you";
     a=a+b;
     b=a.substring(0,a.length()-b.length());
     a=a.substring(b.length());
     System.out.println(a+" "+b);
 }
 @Test
    public void whitespacenov19()
 {
     String Str="how you now";
     String replstr=Str.replaceAll("\\s","");
     System.out.println(replstr);

 }
@Test
    public void fibbonov19()
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
    public void reverseSTrnov19()
{
    String str="malayalaml";
    String replstr="";
    for(int i=str.length()-1;i>=0;i--){
        replstr+=str.charAt(i);
    }
    System.out.println(replstr);
}
@Test
    public void sortnonov19()
{
    int[] arr=new int[]{4,3,1,5,2};
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
        System.out.print(arr[i]+ " ");
}

@Test
    public void reverseelenov19()
{
    int[] arr=new  int[]{43,2,34,232,3};
    for(int i=arr.length-1;i>=0;i--)
        System.out.println(arr[i]);
}
@Test
    public void dupliele()
{
    int[] arr=new int[]{1,1,2,2,3,3,4,5,5};
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
    public void primenonov19()
{
    int num=15;
    int temp;
    Boolean prime=true;
    for (int i=2;i<=num/2;i++)
    {
        temp=num%i;
        if(temp==0)
        {
            prime=false;
            break;
        }
    }
    if(prime)
        System.out.println("prime "+num);
    else
        System.out.println("Not prime "+num);
}

@Test
    public void sortwordnov19()
{
   String[] c={"Ban","Zim","AUs","Cat"};
   String a="";
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
   for(int i=0;i<c.length;i++)
       System.out.print(c[i]+" ");

}
@Test
    public void duplicharactnov19()
{
    String str="seleniuml";
    char[] c=str.toCharArray();
    for(int i=0;i<c.length;i++)
    {
        int count=1;
        for(int j=i+1;j<c.length;j++)
        {
            if(c[i]==c[j] && c[j]!=' ')
            {
                count++;
                c[j]='0';
            }
        }
        if(count>1 && c[i]!='0')
            System.out.println(count+" "+c[i]);
    }
}
@Test
    public void reverseeachwordnov19()
{
    String inputstr="Test Automation";
    String[] words=inputstr.split(" ");
    StringBuilder reverseSentence=new StringBuilder();
    for(String word:words)
    {
        StringBuilder reverseWord=new StringBuilder(word);
        reverseSentence.append(reverseWord.reverse()).append(" ");
    }
    System.out.println(reverseSentence.toString().trim());
}
@Test
    public void pyamidnov19()
{
    int rows=5;
    for(int i=1;i<=rows;i++)
    {
        for(int j=i;j<rows;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i)-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
@Test
    public void secondsmallest()
{
    int[] arr=new int[]{4,2,1,3,5};
    int smallest=Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<smallest)
        {
            secondSmallest=smallest;
            smallest=arr[i];
        }
        else if(arr[i]<secondSmallest && arr[i]!=smallest)
        {
            secondSmallest=arr[i];
        }
    }
    System.out.println(secondSmallest);
}
@Test
    public void fctorialtestnov19()
{
    int factorial=1;
    int num=5;
    for(int i=1;i<=num;i++)
    {
        factorial*=i;
    }
    System.out.println(factorial);
}


}
