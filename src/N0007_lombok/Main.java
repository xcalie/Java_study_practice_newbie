package N0007_lombok;

import lombok.Getter;
import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "张三");
        System.out.println(person.getId());
    }
}

@Getter
@Setter
class Person {
    private int id;
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

}