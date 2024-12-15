package Basics.B0007_Collections.HashSetUsing;

import org.junit.Test;

import java.util.*;

public class HashMapTest {
    @Test
    public void Test() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "1");
        hashMap.put("2", "2");
        //覆盖 尽量避免
        hashMap.put("2", "3");
        hashMap.put("3", "3");
        hashMap.put("4", "4");

        hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

        //通过接口装载(父类) key
        Set<String> keys = hashMap.keySet();
        keys.forEach(System.out::println);


        //Entry 是 Map.Entry 的子类 专门用于记录键值对
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        entrySet.forEach(System.out::println);


        //迭代器实现
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }
}
