package com.java.sorting;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    @Test
    public void DateFormat()
    {
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        String dateStr=formatter.format(date);
        System.out.println(dateStr);

    }
}
