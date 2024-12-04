package Basics.B0000_BaseAPI.B0008_Calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        // 获取当前时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println();

        // 获取当前时间对应的日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println();


        // 获取日历对象中的年、月、日、时、分、秒
        int year = cal.get(Calendar.YEAR);
        int month= cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");
        System.out.println();

        // 设置日历对象中的年、月、日、时、分、秒
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        System.out.println(cal.getTime());
        System.out.println();

        // 获取日历对象中的其他信息
        System.out.println(cal.getTimeInMillis());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getFirstDayOfWeek());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));
        System.out.println(cal.get(Calendar.ZONE_OFFSET));
        System.out.println(cal.get(Calendar.DST_OFFSET));
        System.out.println(cal.get(Calendar.ERA));
        System.out.println();


    }
}
