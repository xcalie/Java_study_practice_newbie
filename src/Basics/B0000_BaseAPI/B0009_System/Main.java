package Basics.B0000_BaseAPI.B0009_System;

public class Main {
    public static void main(String[] args)
    {
        //获取系统属性
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));


        //获取系统时间
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());


        //数组拷贝
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);


        //垃圾回收
        System.gc();
        Runtime.getRuntime().gc();
    }
}
