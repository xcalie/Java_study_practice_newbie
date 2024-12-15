package Basics.B0007_Collections.HashSetUsing;

import org.junit.Test;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    @Test
    public void Test() {
        // LinkedHashSet集合的元素可以重复，但是不能有相同的元素，且保证元素插入的顺序
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("hello");
        linkedHashSet.add("java");
        linkedHashSet.add("java");

        System.out.println(linkedHashSet.size());
        linkedHashSet.forEach(System.out::println);

    }
}
