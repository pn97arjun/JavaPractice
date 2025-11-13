package com.java.practiceDaywise;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class oct25_2025 {

    @Test
    public void palindrome_25oct()
    {
        int n=4541,temp,sum=0,r;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palin"+sum);
        else
            System.out.println("Not Palin"+sum);
    }
    @Test
    public void date25oct()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String datest=formatter.format(date);
        System.out.println("date: "+datest);
    }
    @Test
    public void swapno25Oct()
    {
        int a=5,b=10;
        a=a+b;//15
        b=a-b;//10
        a=a-b;//5
        System.out.println(a+" "+b);
    }
    @Test
    public void swapSt25oct()
    {
        String a="how";
        String b="you";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);

    }
    @Test
    public void whitespac25oct()
    {
        String st=" how are you";
        String rp=st.replaceAll("\\s","");
        System.out.println(rp);
    }
    @Test
    public void fibo25oct()
    {
        int f1=0,f2=1,f3=0,n=10;
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
    public void reverseSt25oct()
    {
        String st="MalayalaM";
        String rv="";
        for(int i=st.length()-1;i>=0;i--)
        {
            rv+=st.charAt(i);
        }
        System.out.println(rv);
    }
    @Test
    public void sortno25oct()
    {
        int[] arr=new int[]{4,5,1,3,2,7,6};
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
            System.out.println(arr[i]);
    }
    @Test
    public void primeNo()
    {
        int num=10;
        int temp=0;
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
            System.out.println("Prime"+num);
        else
            System.out.println("Not Prime"+num);
    }
    @Test
    public void reverseEachword25oct()
    {
        String st="Test Automation";
        String[] words=st.split(" ");
        StringBuilder reverseSentence=new StringBuilder();
        for(String word:words)
        {
            StringBuilder reverseWord=new StringBuilder(word);
            reverseSentence.append(reverseWord.reverse()).append(" ");

        }
        System.out.println(reverseSentence.toString().trim());

    }
    @Test
    public void excelPg25oct() throws  Exception
    {
        FileInputStream fs=new FileInputStream("testdata.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fs);
        XSSFSheet sheet=workbook.getSheet("sheet1");
        XSSFRow row= sheet.getRow(0);
        XSSFCell cel=row.getCell(0);
        System.out.println(cel.getStringCellValue());



    }
    @Test
    public void duplicharString()
    {
        String a="selenium l";
        char[] c =a.toCharArray();
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


}
