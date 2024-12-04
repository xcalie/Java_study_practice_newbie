package Newbie.N0012_super;

public class Main {
    public static void main(String[] args)
    {

    }
}

class Person {
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

    public void print()
    {
        System.out.println("name: " + name);
    }
}

class Student extends Person {
    private int id;

    //#region constructor

    public Student()
    {
        super("Tom");
        System.out.println("Student()");
    }

    public Student(int id, String name)
    {
        super(name);
        this.id = id;
        System.out.println("Student(int id, String name)");
    }

    //#endregion

    //#region getter/setter

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    //#endregion

    public void print()
    {
        //啃老，接着父类的代码
        //否则等效重写
        super.print();
        System.out.println("id: " + id + ", name: " + getName());
    }
}

