package Basics.B0005_IOStream;

import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.io.*;
import java.util.*;



public class IOStreamTest {

    public enum ControlWith {
        ToUpper,
        ToLower,
    }

    @Setter
    private static String pathInput = "E:\\Project\\_data\\txt\\Test.txt";
    @Setter
    private static String pathOutput = "E:\\Project\\_data\\txt\\Test2nd.txt";
    @Getter
    private static byte[] bytes;

    public void InputStreamTest1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathInput);
        int by = 0;
        List<Byte> list = new ArrayList<>();
        while ((by = fileInputStream.read()) != -1) {
            list.add((byte) by);
        }
        bytes = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bytes[i] = list.get(i);
        }
        fileInputStream.close();
    }

    public void InputStreamTest2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(pathInput);
        FileOutputStream fileOutputStream = new FileOutputStream(pathInput);

        byte[] buffer = new byte[1024];
        int by = 0;
        while ((by = fileInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, by);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }

    public void InputStreamTest3() throws IOException {
        //vip装饰设计模式
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathInput));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pathOutput));

        int by = 0;
        while ((by = bufferedInputStream.read()) != -1) {
            System.out.print((char) by);
            bufferedOutputStream.write(by);
        }

        bufferedOutputStream.close();
        bufferedInputStream.close();
    }


    public void OutputStreamTest() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(pathInput);

        for (byte b : bytes) {
            fileOutputStream.write(b);
        }

        fileOutputStream.close();
    }

    private void Control(ControlWith controlWith){
        switch (controlWith){
            case ToUpper:
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) Character.toUpperCase(bytes[i]);
                }
                break;

            case ToLower:
                for (int i = 0; i < bytes.length; i++) {
                    bytes[i] = (byte) Character.toLowerCase(bytes[i]);
                }
                break;
        }
    }

    @Test
    public void GetAllIO() throws IOException {
        //InputStreamTest1();
        InputStreamTest3();
        //Control(ControlWith.ToUpper);
        //OutputStreamTest();
    }
}
