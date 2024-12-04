package Newbie.N0014_abstruct;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student(1, "张三");
        // 抽象类不能使用实例化
        // 子类继承抽象类或者类中的抽象方法，必须重写抽象方法
        // 纯的抽象类 可以 写作 接口interface
    }
}

abstract class Person {

    protected int id;
    protected String name;

    public abstract void print();
}

class Student extends Person {

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //#region getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //#endregion

    public void print() {
        System.out.println("id: " + id + " name: " + name);
    }

}
