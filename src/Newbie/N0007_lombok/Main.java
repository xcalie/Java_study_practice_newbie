package Newbie.N0007_lombok;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "张三");
        person.print();
        person.setName("李四");
        person.print();
        person.setId(2);
        person.print();
    }
}

