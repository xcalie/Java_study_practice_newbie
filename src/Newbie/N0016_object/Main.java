package Newbie.N0016_object;

public class Main {
    public static void main(String[] args) {
        Object obj = new Person();
        ((Person)obj).print();
    }
}

class Person{
    private String name;
    private int age;

    //#region constructor

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //#endregion

    //#region getter setter

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    //#endregion

    public void print(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}