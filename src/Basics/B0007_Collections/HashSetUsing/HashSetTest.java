package Basics.B0007_Collections.HashSetUsing;

import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    @Test
    public void test(){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("d");

        // HashSet内部是无序的, 所以遍历的时候, 顺序是不一定的
        hashSet.forEach(System.out::println);
    }
}
