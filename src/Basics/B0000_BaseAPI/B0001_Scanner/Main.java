package Basics.B0000_BaseAPI.B0001_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //从键盘接受数字

        //next方式接受字符串
        String str = scan.next();
        System.out.println("输入的数据为：" + str);
        //nextLine接收下一行
        String str2 = scan.nextLine();
        System.out.println("输入的数据为：" + str2);
        //nextInt方式接受整数
        int num = scan.nextInt();
        System.out.println("输入的数据为：" + num);
        //nextFloat方式接受小数
        float num2 = scan.nextFloat();
        System.out.println("输入的数据为：" + num2);
        //nextBoolean方式接受布尔值
        boolean b = scan.nextBoolean();
        System.out.println("输入的数据为：" + b);
        //nextDouble方式接受双精度浮点数
        double num3 = scan.nextDouble();
        System.out.println("输入的数据为：" + num3);
        //nextByte方式接受byte类型
        byte num4 = scan.nextByte();
        System.out.println("输入的数据为：" + num4);

        //关闭流
        scan.close();
    }
}
