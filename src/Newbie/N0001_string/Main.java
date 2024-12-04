package Newbie.N0001_string;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + "," + str2);

        char[] strArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(strArray);

        int[] intArray = new int[] {1, 2, 3, 44};
        System.out.println(Arrays.toString(intArray));

    }
}