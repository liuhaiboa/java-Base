package com.haibo.MyCode;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by liuhaibo on 18/9/5.
 */
public class data {
    public static void main(String[] args) {
       // Date now= new Date();
       // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

       // System.out.println(DateFormat.getDateInstance().format(new java.util.Date()));
        //System.out.println(DateFormat.getDateInstance(2).format(new java.util.Date()));
       // Calendar calendar = Calendar.getInstance();
        //LocalDate today = LocalDate.now();
        //System.out.println("今天日期是：" + today);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        System.out.println(sdf.format(date));


//
//        ParsePosition pos = new ParsePosition(0);
       // System.out.println(now);

    }
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }
}
