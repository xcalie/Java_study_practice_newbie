package Newbie.N0015_interface;

public class Main {
    public static void main(String[] args)
    {
        Dog dog = new Dog(1, "小黑");
    }
}

// 接口 针对行为
// 抽象类 针对对象

interface Animal {
    public void eat();
    public void run();
    public void sleep();
}

abstract class Pet{
    protected int id;
    protected String name;

    //#region Constructor
    public Pet()
    {

    }
    public Pet(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    //#endregion

    //#region Getter and Setter
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //#endregion
}

class Dog extends Pet implements Animal{

    //#region Constructor
    public Dog()
    {

    }

    public Dog(int id, String name)
    {
        super(id, name);
    }
    //#endregion

    @Override
    public void eat()
    {

    }

    @Override
    public void run()
    {

    }

    @Override
    public void sleep()
    {

    }
}
