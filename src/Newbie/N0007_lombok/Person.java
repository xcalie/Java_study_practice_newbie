package Newbie.N0007_lombok;

import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public void print() {
        System.out.println(id + " " + name);
    }

    //#region Getters/Setters

//    public int getId()
//    {
//        return this.id;
//    }
//
//    public void setId(int id)
//    {
//        this.id = id;
//    }
//
//    public String getName()
//    {
//        return this.name;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }

    //#endregion

}
