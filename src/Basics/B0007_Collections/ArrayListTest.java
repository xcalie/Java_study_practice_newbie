package Basics.B0007_Collections;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void test(){
        // ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add 添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.toString());

        // remove 移除
        list.remove(1);
        System.out.println(list.toString());

        // set 替换
        list.set(0, "ddd");
        System.out.println(list.toString());
        System.out.println();

        // get 获取
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // foreach
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        // clear 清空
        list.clear();
        System.out.println(list.toString());
        // isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        System.out.println();


        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.set(0, "ddd");
        // size 获取大小
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println();


        // contains 判断是否包含
        System.out.println(list.contains("ddd"));
        System.out.println();

        // indexOf lastIndexOf 返回索引
        System.out.println(list.indexOf("ddd"));//从头开始
        System.out.println(list.lastIndexOf("ddd"));//从尾开始
        System.out.println();

        // get 从指定位置获取
        System.out.println(list.get(0));
        System.out.println();

        // subList 截取
        System.out.println(list.subList(0, 2));//截取0到1 的元素
        System.out.println();

        // toArray 转为数组
        System.out.println(list.toArray());//难以识别
        System.out.println(list.toString());
        System.out.println(list);
        System.out.println();

        // hashCode 获取哈希值
        System.out.println(list.hashCode());
        System.out.println();

        // equals 判断
        ArrayList<String> list2 = list;
        System.out.println(list.equals(list2));

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("aaa");
        list3.add("bbb");
        list3.add("ccc");
        list3.set(0, "ddd");
        System.out.println(list.equals(list3));

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("aaa");
        list4.add("bbb");
        list4.add("ccc");
        System.out.println(list.equals(list4));
        System.out.println();
    }
}
