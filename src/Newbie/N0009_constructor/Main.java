package Newbie.N0009_constructor;

public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student(1, "张三");
    }
}

class Student {
    private int id;
    private String name;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
