package Basics.B0002_StringBuilder;

import org.junit.Test;

public class StringBuilderTest {

    @Test
    public void test()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb.toString());

        //替换
        sb.replace(6, 7, "java");
        System.out.println(sb.toString());

        //插入
        sb.insert(5, "java");
        System.out.println(sb.toString());

        //删除
        sb.delete(5, 9);
        System.out.println(sb.toString());

        //进行翻转
        sb.reverse();
        System.out.println(sb);

        //长度和容量
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //改变容量
        sb.ensureCapacity(100);

        //压缩
        sb.trimToSize();

        //截取
        sb.substring(5);

        //获取子串
        sb.subSequence(5, 10);

        //获取字符
        sb.charAt(5);

        //设置字符
        sb.setCharAt(5, 'a');

        //获取字符串
        sb.toString();

        //转换为字符数组
        sb.toString().toCharArray();

        //转换为小写和大写
        sb.toString().toLowerCase();
        sb.toString().toUpperCase();

        //字符串操作
        // trim() 去除首尾空格
        sb.toString().trim();
        // replace() 替换
        sb.toString().replace(" ", "");
        // split() 分割
        sb.toString().split(" ");
        // contains() 包含
        sb.toString().contains(" ");
        // startsWith() 以...开头
        sb.toString().startsWith(" ");
        // endsWith() 以...结尾
        sb.toString().endsWith(" ");
        // equals() 比较
        sb.toString().equals(" ");
        // matches() 正则
        sb.toString().matches(" ");
        // hashCode() 哈希值
        sb.toString().hashCode();
        // compareTo() 比较
        sb.toString().compareTo(" ");
        // equalsIgnoreCase() 忽略大小写比较
        sb.toString().compareToIgnoreCase(" ");
        // equalsIgnoreCase() 忽略大小写比较
        sb.toString().equalsIgnoreCase(" ");
        // intern() 获取字符串常量池中的字符串
        sb.toString().intern();
        // concat() 连接
        sb.toString().concat(" ");
        // length() 长度
        sb.toString().length();
        // isEmpty() 是否为空
        sb.toString().isEmpty();
        // codePointAt() 获取字符的Unicode码
        sb.toString().codePointAt(0);
        // codePointBefore() 获取前一个字符的Unicode码
        sb.toString().codePointBefore(0);
        // codePointCount() 获取指定范围内的Unicode码数量
        sb.toString().codePointCount(0, 0);
        // offsetByCodePoints() 获取指定位置偏移后的位置
        sb.toString().offsetByCodePoints(0, 0);
        // indexOf() 查找
        sb.toString().indexOf(" ");
        // lastIndexOf() 查找
        sb.toString().lastIndexOf(" ");
    }
}
