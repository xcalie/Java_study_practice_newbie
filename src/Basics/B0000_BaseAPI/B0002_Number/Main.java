package Basics.B0000_BaseAPI.B0002_Number;

public class Main {
    public static void main(String[] args) {
        //Number是所有数字类的父类，但是不能直接使用，需要使用子类
        Number number = 1;
        System.out.println(number);
        number = 2.0f;
        System.out.println(number);
        number = 3.14;
        System.out.println(number);


        // Integer使用会存在拆箱装箱的问题，所以使用int更方便
        //但是用int不能装入Object
        int int1 = 1;
        System.out.println(int1);
        Integer int2 = 1;
        System.out.println(int2);

        // Byte
        byte b1 = 1;
        System.out.println(b1);
        Byte b2 = 1;
        System.out.println(b2);

        // Short
        short s1 = 1;
        System.out.println(s1);
        Short s2 = 1;
        System.out.println(s2);

        // Boolean
        boolean bool1 = true;
        System.out.println(bool1);
        Boolean bool2 = true;
        System.out.println(bool2);

        // Character
        char c1 = 'a';
        System.out.println(c1);
        Character c2 = 'a';
        System.out.println(c2);

        // Float
        float f1 = 1.0f;
        System.out.println(f1);
        Float f2 = 1.0f;
        System.out.println(f2);

        // Double
        double d1 = 1.0;
        System.out.println(d1);
        Double d2 = 1.0;
        System.out.println(d2);


    }
}
