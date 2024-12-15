package Basics.B0005_IOStream;

import lombok.Setter;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    @Setter
    private String filePathInput = "src/Basics/B0005_IOStream/init.txt";

    /**
     * 缓冲字符输入流
     *
     * @throws IOException
     */
    @Test
    public void bufferReaderTest() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathInput));

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }
}
