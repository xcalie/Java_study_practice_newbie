package Newbie.N0002_import;
// 打包

import Newbie.N0001_string.Students;
// 通过import 引入包

public class Main {
    public static void main(String[] args) {
        Students stu = new Students();
        stu.id = 2;
        System.out.println(stu.id);
    }
}
