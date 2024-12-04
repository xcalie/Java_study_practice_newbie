package Newbie.N0008_ToString;

import Newbie.N0007_lombok.Person;

public class Student extends Person {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.getId() +
                ", name='" +  + '\'' +
                '}';
    }
}
