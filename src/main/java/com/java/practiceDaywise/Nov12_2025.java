package com.java.practiceDaywise;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Nov12_2025 {
    @Test
    public void palinnov12()
    {
        int n=4541,sum=0,r=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Palindrome"+sum);
        else
            System.out.println("Not a palindrome");
    }
    @Test
    public void datefrnov12()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);
    }
    @Test
    public void swapNobov12()
    {
        int a=5,b=10;
        a=a+b;//15
        b=a-b;//10
        a=a-b;//5
        System.out.println(a+" "+b);
    }
    @Test
    public void swapStrnov12()
    {
        String a="how";
        String b="you";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }
    @Test
    public void whitespcnov12()
    {
        String st="how y u";
        String rpl=st.replaceAll("\\s","");
        System.out.println(rpl);
    }
    @Test
    public void fibbonov12()
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
        String st="malayalam";
        String rev="";
        for(int i=st.length()-1;i>=0;i--)
        {
            rev+=st.charAt(i);
        }
        System.out.println(rev);
    }
    @Test
    public void sortNosinArraynov12()
    {
        int[] arr=new int[]{4,2,1,5,3};
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
            System.out.print(arr[i]);
    }
    @Test
    public void reverseEleArraynov12()
    {
        int[] arr=new int[]{5,4,32,1,2};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
    @Test
    public void duplinov12()
    {
        int[] arr=new int[]{1,2,1,2,3,4};
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
    public  void primenonov12()
    {
        int num=13;
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
            System.out.println("prime "+num);
        else
            System.out.println("Not a prime "+num);
    }

    @Test
    public void sortwordsnov12()
    {
        String[] c={"Zam","Aus","Ban","WI"};
        String a="";
        for(int k=0;k<c.length;k++)
            System.out.print(c[k]+" ");
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
        System.out.println();
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
    @Test
    public void duplicharnov12()
    {
        String a="selenium l";
        char[] c=a.toCharArray();
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
    public void reverseachwordnov12()
    {
        String inputString="Test Automation";
        String[] words=inputString.split(" ");
        StringBuilder reverseSentence=new StringBuilder();
        for(String word:words)
        {
            StringBuilder reverseWord=new StringBuilder(word);
            reverseSentence.append(reverseWord.reverse()).append(" ");
        }
        System.out.println(reverseSentence.toString().trim());
    }
    @Test
    public void excelnov12() throws Exception
    {
        File file=new File("testdata.xlsx");
        FileInputStream fs=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(fs);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        XSSFRow row=sheet.getRow(0);
        XSSFCell cell= row.getCell(0);
        System.out.println(cell.getStringCellValue());

    }
    @Test
    public void pyramid()
    {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<rows;j++)
            {
                System.out.print(" "); //space for *
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*"); //2*i-1 formaula
            }
            System.out.println();
        }
    }
    @Test
    public void secondsmallest()
    {
        int[] arr=new int[]{4,3,1,2,5};
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

}
