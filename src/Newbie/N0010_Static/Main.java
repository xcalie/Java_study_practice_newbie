package Newbie.N0010_Static;

public class Main {
    public static void main(String[] args)
    {
        One.print();
        System.out.println(One.a);

        One one = new One();
        //一般不会这么写
        one.print();
        System.out.println(one.a);

        //#region objet的承接与转化

        Object o = new Two();
        Two.print();

        System.out.println(((Two)o).getB());

        ((Two)o).print1();
        ((One)o).print1();

        //#endregion

    }
}

class One{

    public int id = 1;

    public static int a = 1;

    // 静态函数不能重写！！
    public static void print(){
        System.out.println("One");
    }

    public void print1(){
        System.out.println("One");
    }
}

class Two extends One{

    public static int a = 2;

    private static final int b = 3;

    public int getB(){
        return b;
    }

    public static void print(){
        System.out.println("Two");
    }

    // 一旦同名就会发生重写
    // 使用super调用父类方法
    @Override
    public void print1(){
        super.print1();
        System.out.println("Two");
    }
}
