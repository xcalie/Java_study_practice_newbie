

import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        SolutionIoFile.InBuilder();
    }
}

class SolutionIoFile
{
    public static void InBuilder()
    {
        try(
                InputStream is = new FileInputStream("test_newbie_0005\\all\\inputAssemble\\");
                OutputStream os = new FileOutputStream("test_newbie_0005\\all\\outputAssemble\\");
                MyConnection conn = new MyConnection(is, os);
                )
        {




        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}

