package Basics.B0000_BaseAPI.B0007_SimpleDateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {
        //DateFormat 是 Java 中用于格式化和解析日期和时间的抽象基类。
        System.out.println("DateFormat");

        DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dfShort.format(new Date()));

        DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dfMedium.format(new Date()));

        DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dfLong.format(new Date()));

        DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dfFull.format(new Date()));

        // 默认
        DateFormat dfDefault = DateFormat.getDateInstance();
        System.out.println(dfDefault.format(new Date()));
        DateFormat dfDefault2 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.CHINA);
        System.out.println(dfDefault2.format(new Date()));


        // SimpleDateFormat 是一个日期格式化类，它提供了一系列的方法来格式化日期对象。
        // SimpleDateFormat 类提供了 several methods to format and parse dates.
        System.out.println("SimpleDateFormat");

        // 创建一个日期对象
        Date date = new Date();
        // 创建一个格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化日期对象
        String dateStr = sdf.format(date);
        // 输出日期字符串
        System.out.println(dateStr);
    }
}
