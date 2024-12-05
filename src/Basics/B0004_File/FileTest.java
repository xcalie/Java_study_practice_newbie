package Basics.B0004_File;

import org.junit.Test;

import java.io.File;

public class FileTest {

    @Test
    public void Test() {
        // 创建文件对象
        File file = new File("E:\\Project\\_data\\txt\\TestCreate.txt");
        // 创建文件夹对象
        File file1 = new File("E:\\Project\\_data\\txt\\TestCreate");

        // 判断文件是否存在
        System.out.println(file.exists());
        // 判断是否为文件或文件夹
        System.out.println(file.isFile());
        // 判断是否为文件夹
        System.out.println(file.isDirectory());

        // 获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        // 获取文件路径
        System.out.println(file.getPath());
        // 获取文件大小
        System.out.println(file.length());
        // 获取文件名
        System.out.println(file.getName());
        // 获取文件父路径
        System.out.println(file.getParent());
        // 获取文件最后修改时间
        System.out.println(file.lastModified());

        // 获取文件权限 是否允许读
        System.out.println(file.canRead());
        // 获取文件权限 是否允许写
        System.out.println(file.canWrite());
        // 获取文件权限 是否允许执行
        System.out.println(file.canExecute());

        // 获取文件是否隐藏
        System.out.println(file.isHidden());
        // 获取文件列表
        System.out.println(file.list());
        // 获取文件列表 带文件类型
        System.out.println(file.listFiles());

        // 创建文件
        System.out.println(file.mkdir());
        // 创建文件夹
        System.out.println(file1.mkdirs());
        // 删除文件
        //System.out.println(file.delete());
        // 重命名文件
        //System.out.println(file.renameTo(new File("E:\\Project\\_data\\txt\\TestCreate1.txt")));
        // 创建文件
        //System.out.println(file.createNewFile());

        // 设置文件权限 读
        System.out.println(file.setReadable(true));
        // 设置文件权限 写
        System.out.println(file.setWritable(true));
        // 设置文件权限 执行
        System.out.println(file.setExecutable(true));

        // 设置文件权限 最后修改时间
        System.out.println(file.setLastModified(System.currentTimeMillis()));
        // 设置文件权限 只读
        System.out.println(file.setReadOnly());
    }
}
