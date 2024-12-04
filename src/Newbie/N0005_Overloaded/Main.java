package Newbie.N0005_Overloaded;

public class Main {
    public static void main(String[] args)
    {
        Student student = new Student(1, "张三");
        System.out.println(student);
        Student student1 = new Student();
        System.out.println(student1);
        //同名的构造函数
        //1.参数类型不同
        //2.参数个数不同
        //3.参数顺序不同
        //4.参数类型不同，但是可以自动类型转换
        //5.参数类型相同，但是可以省略参数类型
        Student student2 = new Student(1, 2, 3, 2, 4, 4, 5, 4);
        System.out.println(student2);
    }
}
