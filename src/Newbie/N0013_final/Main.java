package Newbie.N0013_final;

public class Main {
    public static void main(String[] args)
    {
        Student.instance.print1();
        Student.instance.setName("李四");
        Student.instance.print();
    }
}


class Person {
    //禁止修改的属性
    private static final int NUM_PEOPLE_MAX = 10;
    //静态属性
    private static int numPeople = 10;

    private String name;

    //#region constructor

    public Person()
    {
        System.out.println("Person()");
    }

    public Person(String name)
    {
        this();
        this.name = name;
        System.out.println("Person(String name)");
    }

    //#endregion

    //#region getter/setter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //#endregion


    // final直接禁止重写
    public final void print()
    {
        System.out.println("name: " + name);
    }

    public static int getNumPeopleMax()
    {
        return NUM_PEOPLE_MAX;
    }
}

class Student extends Person {
    private int id;

    public static Student instance = new Student();

    private Student(){

    }

    public void print1() {
        System.out.println("Student()" + Person.getNumPeopleMax());
    }


//    public void print()
//    {
//        super.print();
//        System.out.println("id: " + id + ", name: " + getName());
//    }


}

