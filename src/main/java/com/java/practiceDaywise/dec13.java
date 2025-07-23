package com.java.practiceDaywise;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dec13 {

  @Test
    public void DateClass()
  {

    Date date=new Date();

    SimpleDateFormat sample=new SimpleDateFormat("dd/MM/yyyy");
    String s=sample.format(date);
    System.out.println(s);

  }

  @Test
  public void WhiteSpace()
  {
    String st="how are you";
    String replaceSt=st.replaceAll("\\s","");
    System.out.println(replaceSt);
  }

  @Test
  public void reverseElement()
  {
    int[] arr=new int[]{5,41,6};
    for(int i=arr.length-1;i>=0;i--)
    {
      System.out.println(arr[i] + " ");
    }

  }

  @Test
  public void duplicateElements()
  {
    int[] arr=new int[]{8,8,1,2,3,4,4};

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
  public void fibo()
  {
    int f1=0,f2=1,f3=0;

    System.out.println(f1);
    System.out.println(f2);
    for(int i=1;i<=10;i++)
    {
      f3=f1+f2;
      System.out.println(f3+ " ");
      f1=f2;
      f2=f3;
    }
  }

  @Test
  public void reverseSt()
  {
    String s="MALAYALAM";
    String r="";

    for(int i=s.length()-1;i>=0;i--)
    {
      r=r+s.charAt(i);
    }
    System.out.println(r);
  }

@Test
  public void swapNo()
{
   int a=10,b=5;

   a=a+b; //15
   b=a-b; //10
  a= a-b; //5

  System.out.print(a+" "+b);

}

@Test
 public  void swapst()
{
  String a="how";
  String b="you";

  a=a+b; //apend

  b=a.substring(0,a.length()-b.length());
  a=a.substring(b.length());

  System.out.println(a +" "+ b);
}

@Test
public void palin()
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
    System.out.println("not pali");

}

@Test
  public void reverseStr()
{
  StringBuilder s=new StringBuilder("String1");
  System.out.println(s.reverse().toString());
}

@Test
public void sortNo()
{
  int[] arr=new int[]{5,6,1,2,4,3};

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
    System.out.println(arr[i]+" ");
}

@Test
public void sortWords()
{
  String[] a={"Zimbawe","Aus","Bang"};
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
    System.out.println(a[k]+" ");
}

@Test
  public void ExcelTest()
{
  XSSFWorkbook xssfWorkbook= null;
  try {
    xssfWorkbook = new XSSFWorkbook("./data/excelSheet.xlsx");
  } catch (IOException e) {
    e.printStackTrace();
  }
  XSSFSheet xssfSheet=xssfWorkbook.getSheet("Sheet1");

  int rowcount=xssfSheet.getPhysicalNumberOfRows();
  System.out.println(rowcount);
  DataFormatter dataFormatter=new DataFormatter();
  Object value=dataFormatter.formatCellValue(xssfSheet.getRow(0).getCell(0));
  System.out.println(value);
}

@Test
  public void elemestReverseOrder()
{
  int[] arr=new int[]{5,4,3,2,1,};

  for(int i=arr.length-1;i>=0;i--)
  {
    System.out.println(arr[i]);
  }
}

@Test
  public void dupliEle()
  {
    int[] arr=new int[]{8,8,1,1,2,3,3,4};

    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]==arr[j])
          System.out.println(arr[i]);
      }
    }
  }




}
