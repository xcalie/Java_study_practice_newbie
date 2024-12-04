package Basics.B0000_BaseAPI.B0006_Date;

import java.sql.Timestamp;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 获取当前时间
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 获取当前时间，并格式化输出
        Date date = new Date(time);
        System.out.println(date);

        // 获取当前时间，并格式化输出
        Date sqlDate = new Date(time);
        System.out.println(sqlDate);

        //获取当前时间，并格式化输出
        Timestamp timestamp = new Timestamp(time);


    }
}
