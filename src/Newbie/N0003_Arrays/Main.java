package Newbie.N0003_Arrays;

import java.util.Arrays;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //重写toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 升序
        //return this.id - o.id;
        // 降序
        return o.id - this.id;

        //具体原理
        // 1. 比较两个对象的id值，如果小于0，则认为当前对象小于o，返回-1，否则返回1。
        // 2. 如果两个对象的id值相等，则认为当前对象等于o，返回0。
        // 3. 如果当前对象的id值大于o，则认为当前对象大于o，返回1。

    }


}


public class Main {
    public static void main(String[] args) {
        //普通的静态数组
        int[] arr = new int[]{1, 2, 5, 1, 5};
        int[] arr2 = new int[]{1, 2, 5, 1, 5};
        int[] arr3 = new int[] {1, 1, 5, 2, 5};

        //排序
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));

        //倒序排序 需要覆写MyComparator接口
        Student[] students = new Student[]{new Student(1, "张三"), new Student(3, "王五"), new Student(2, "李四")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        //二分查找 使用前排序
        System.out.println(Arrays.binarySearch(arr, 2));
        //不包含返回-1


        //比较数组 顺序 数目 值 均相同才为相同数组
        System.out.println(Arrays.equals(arr, arr2));
        System.out.println(Arrays.equals(arr, arr3));


        //填充 fill
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));


        //拷贝 copyOf 返回的是一个新的引用类型数组不是原数组 会被垃圾回收
        int[] arr4 = Arrays.copyOf(arr, 5);
    }
}
