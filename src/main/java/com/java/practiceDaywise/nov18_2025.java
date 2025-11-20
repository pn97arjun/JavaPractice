package com.java.practiceDaywise;

import org.testng.annotations.Test;

public class nov18_2025 {
    @Test
    public void pyramidnov18()
    {
      int rows=5;
      for(int i=1;i<=rows;i++)
      {
          for(int j=i;j<rows;j++)
          {
              System.out.print(" ");
          }
          for(int k=1;k<=(2*i-1);k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
    }
    @Test
    public void reverseEachwordnov18()
    {
        String inoutstring="Test Automation";
        String[] words=inoutstring.split(" ");
        StringBuilder reverseSentence=new StringBuilder();
        for(String word:words)
        {
            StringBuilder reverseWord=new StringBuilder(word);
            reverseSentence.append(reverseWord.reverse()).append(" ");

        }
        System.out.println(reverseSentence.toString().trim());
    }
    @Test
    public void sortwordnov18()
    {
        String[] c={"Zam","Aus","Ban","WI"};
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
        for(int k=0;k<c.length;k++)
            System.out.print(c[k]+" ");
    }
    @Test
    public void primenov18()
    {
        int num=15;
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
            System.out.println("prime"+num);
        else
            System.out.println("not prime"+num);
    }

    @Test
    public void secondsmallestnov18()
    {
        int[] arr =new int[]{4,3,5,1,2};
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest)
            {
                secondsmallest=arr[i];
            }
        }
        System.out.println(secondsmallest);
    }
    @Test
    public void secondlargestnov18()
    {
        int[] arr=new int[]{4,3,2,5,1};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
    }
    @Test
    public void factorialnov18()
    {
        int num=5;
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
