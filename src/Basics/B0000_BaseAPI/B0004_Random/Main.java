package Basics.B0000_BaseAPI.B0004_Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Random 类 用于生成随机数
        //默认种子
        //随机数范围[0, 2^32-1]
        //原理
        //1. 获取当前时间戳
        //2. 将时间戳作为种子
        //3. 使用种子生成随机数
        //4. 返回随机数
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println();

        //限制范围
        System.out.println(random.nextInt(10));
        System.out.println();

        //随机小数 类型不同 精度不同
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextLong());
        System.out.println(random.nextFloat());
        //随机高斯分布(正态分布)
        System.out.println(random.nextGaussian());
        System.out.println();

        //设置种子 为 当前时间戳
        random.setSeed(System.currentTimeMillis());
        System.out.println(random.nextInt());
        System.out.println();

        //设置种子 为 100
        random.setSeed(100);
        System.out.println(random.nextInt());
        System.out.println();


    }

}
