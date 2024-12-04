package Newbie.N0006_OOP;

public class Student {
    public int id;
    public String name;
    public String surname;

    public Student()
    {
        this.id = 0;
        this.name = "Default";
        this.surname = "Default";
    }

    public Student(int id, String name, String surname)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void print()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("------------------------");
    }
}
