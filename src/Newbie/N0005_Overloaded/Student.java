package Newbie.N0005_Overloaded;

import java.util.Arrays;

public class Student
{
    int id;
    String name;

    public Student()
    {
        id = 0;
        name = "";
    }

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Student(int... arrays)
    {
        this.id = arrays[0];
        this.name = Arrays.toString(arrays);
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
}
