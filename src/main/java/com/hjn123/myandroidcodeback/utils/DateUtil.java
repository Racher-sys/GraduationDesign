package com.hjn123.myandroidcodeback.utils;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * 时间格式化工具类
 */
public class DateUtil {

    //将字符串类型转为Date类型

    //定义格式
    public static final String STANDARD="yyyy-MM-dd HH:mm:ss";
    public static Date string2Date(String strDate){

        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(STANDARD);

        return dateTimeFormat.parseDateTime(strDate).toDate();

    }


    public static Date string2Date(String strDate ,String format){

        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(format);

        return dateTimeFormat.parseDateTime(strDate).toDate();

    }



    //将Date类型转为字符串

    public static String date2String(Date date){
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD);
    }

    public static String date2String(Date date,String format){
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(format);
    }





}
