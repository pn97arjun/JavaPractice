package com.java.practiceDaywise;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Nov6 {
    @Test
    public void propFile() throws Exception
    {
        Properties prop=new Properties();
        String filePath="./ConfigFile/config.properties";
        BufferedReader reader=new BufferedReader(new FileReader(filePath));
        prop.load(reader);
        String userNAme=prop.getProperty("username");
        System.out.println(userNAme);
        reader.close();
    }
    @Test
    public void datePg()
    {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YY");
        String dateST=simpleDateFormat.format(date);
        System.out.println(dateST);
    }
    @Test
    public void whiteSp()
    {
     String st="How are you";
     String reslST=st.replaceAll("\\s","");
        System.out.println(reslST);
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
    public void reverseSt()
    {
        String s="abcd";
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println(r);

    }
    @Test
    public void swapSt()
    {
        String a="How";
        String b="You";

        a=a+b; //append
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a+" "+b);

    }
    @Test
    public void swapNum()
    {
        int a=5,b=10;
        System.out.println(a+" "+b);
        a=a+b; //15
        b=a-b; //5
        a=a-b; //10
        System.out.println(a+" "+b);

    }
    @Test
    public void palin()
    {
        int r=0,sum=0,n=454;
        int temp;
        temp=n;
        while (n>0)
        {
           r=n%10;
           sum=(sum*10)+r;
           n=n/10;

        }
        if(temp==sum)
            System.out.println("palin");
        else
            System.out.println("Not palin");
    }
    @Test
    public void stBuilder()
    {
        StringBuilder st=new StringBuilder("String");
        System.out.println(st.reverse().toString());

    }
    @Test
    public void sortNo()
    {
        int temp=0;
        int[] arr=new int[]{4,1,2,3};

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
        System.out.println(arr[i]);

    }
  @Test
  public void sortWords()
  {
      String[] a={"Zimbabwe","Aus","Bang"};
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
      for(int k=0;k<a.length;k++)
          System.out.println(a[k]);
  }
  @Test
    public void dupli()
  {
      String a="Selenium Selenium";
      char[] c=a.toCharArray();


      for(int i=0;i<c.length;i++)
      {
          int count=1;
          for(int j=i+1;j<c.length;j++)
          {
              if(c[i]==c[j] && c[i]!=' ')
              {
                  c[j]='0';
                  count++;
              }
          }
          if(count>1 && c[i]!='0')
              System.out.println(c[i]+" "+count);
      }

  }








}
