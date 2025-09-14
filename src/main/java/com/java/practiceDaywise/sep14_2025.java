package com.java.practiceDaywise;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sep14_2025 {
    @Test
    public void palinSep14()
    {
        int n=4541,temp,r=0,sum=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Palin"+sum);
        else
            System.out.println("Not palin"+sum);
    }
    @Test
    public void datesep14()
    {
        Date date =new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);
    }
    @Test
    public void swapNo()
    {
        int a=5,b=10;
        a=a+b; //15
        b=a-b;//5
        a=a-b; //10
        System.out.println(a+" "+b);

    }
    @Test
    public void swapStringsep14()
    {
        String a="How";
        String b="you";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" "+b);
    }
    @Test
    public void whiteSpacesep14()
    {
        String st="How are you";
        String rp=st.replaceAll("\\s","");
        System.out.println(rp);
    }
    @Test
    public void fibbosep14()
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
    public void reversestsep14()
    {
        String st="Test Automation";
        String r="";
        for(int i=st.length()-1;i>=0;i--)
        {
            r+=st.charAt(i);
        }
        System.out.println(r);
    }
    @Test
    public void sortNoSep14()
    {
        int[] arr=new int[]{4,1,2,3,5,7,6};
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
    public void reverseEleSep14()
    {
        int[] arr=new int[]{1,2,3,4};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    @Test
    public void dupliElemeSep14()
    {
        int[] arr=new int[]{1,1,2,2,3,3,4,5};
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
    public void primenoSep14()
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
            System.out.println("Not a prime"+num);

    }
    @Test
    public void sortwordsSep12()
    {
        String[] c={"Zam","Aus","Ban","WI"};
        String a="";
        for(int l=0;l<c.length;l++)
            System.out.print(c[l]+" ");
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
    public void duplicateCharSep14() {
        String a="seleniuml";
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
    public void reverseEachWordSep14()
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
    public void excelProgramSep14() throws Exception {
        File file=new File("testdata.xlsx");
        FileInputStream fs=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(fs);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        Row row =sheet.getRow(0);
        Cell cell=row.getCell(2);
        System.out.println(cell.getStringCellValue());
    }

}
