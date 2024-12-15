package Basics.B0007_Collections;

import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        // 迭代器 利用while遍历
        // 迭代器可以无视类型
        // 迭代器不建议使用嵌套
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s.equals("bbb")){
                //更推荐,会自动对留空进行拼接
                iterator.remove();
            }
        }

        System.out.println("==========================");

        // 增强for循环 迭代器内置
        // 嵌套更推荐增强for循环
        for (String s : list) {
            System.out.println(s);
        }

        for (String s : list){
            if (s.equals("bbb")){
                //及其不推荐，会导致留空不能拼接
                list.remove(s);
            }
        }

        System.out.println("==========================");

        // 普通for循环 大部分时间不适用
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
