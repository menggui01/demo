package com.mg;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

   




    public static void main(String[] args) throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sd = new SimpleDateFormat();
        //实例化date
        Date date =new Date();
        System.out.println(date);
        //格式化 date》String
        String format = sd.format(date);
        System.out.println(format);
        //解析String》date
        String dd = "22-9-25 下午7:52";
        Date parse = sd.parse(dd);
        System.out.println(parse);
        //有参构造器 格式化 date》String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = simpleDateFormat.format(date);
        System.out.println(format1);
        //解析 String》date
        Date parse1 = simpleDateFormat.parse("2022-09-25 12:00:00");
        System.out.println(parse1);
        //解析 String》date
        String brithday = "2022-01-01";
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        Date parse2 = simpleDate.parse(brithday);
        java.sql.Date br = new java.sql.Date(parse2.getTime());
        System.out.println(br);
    }
}
