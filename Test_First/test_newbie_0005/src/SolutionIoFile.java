
import java.util.List;
import java.io.*;

class SolutionIoFile
{
    public static void InBuilder()
    {
        InputStream isIn = null;
        InputStream isVar = null;
        OutputStream osIN = null;
        OutputStream os = null;
        try
        {
            isIn = new FileInputStream("test_newbie_0005\\all\\inputAssemble\\ioInput.txt");

            File f1 = new File("test_newbie_0005\\all\\inputAssemble\\ioInput.txt");
            long size1 = f1.length();
            byte[] bufferNew = new byte[(int) size1];
            int len1 = isIn.read(bufferNew);


            List<Works.Cube> NewCubes = Tools.ChangeInto.change(bufferNew);

            isIn.close();

            osIN = new FileOutputStream("test_newbie_0005\\all\\inputAssemble\\ioInput.txt");
            osIN.write(bufferNew, 0, 0);
            osIN.close();






            isVar = new FileInputStream("test_newbie_0005\\all\\Assemble\\vars.txt");

            File f2 = new File("test_newbie_0005\\all\\Assemble\\vars.txt");
            long size2 = f2.length();
            byte[] bufferOld = new byte[(int) size2];
            int len2 = isVar.read(bufferOld);

            List<Works.Cube> OldCubes = Tools.ChangeInto.change(bufferOld);

            isVar.close();




//            OldCubes.addSlect(NewCubes);
            OldCubes = Tools.ChangeInto.addSelect(OldCubes, NewCubes);



            byte[] bufferAll = Tools.ChangeInto.changeAway(OldCubes);


            os = new FileOutputStream("test_newbie_0005\\all\\Assemble\\vars.txt");

            os.write(bufferAll, 0, bufferAll.length);

            os.close();

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (osIN != null) osIN.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (isIn != null) isIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (isVar != null) isVar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void OutBuilder(List<Works.Cube> cubes)
    {
        OutputStream os = null;
        try
        {
            os = new FileOutputStream("test_newbie_0005\\all\\Assemble\\vars.txt");

            byte[] bufferAll = Tools.ChangeInto.changeAway(cubes);

            os.write(bufferAll, 0, bufferAll.length);

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Works.Cube> Done()
    {
        byte[] bufferMId = null;
        InputStream is = null;
        try
        {
            is = new FileInputStream("test_newbie_0005\\all\\Assemble\\vars.txt");

            File f = new File("test_newbie_0005\\all\\Assemble\\vars.txt");
            long size = f.length();

            byte[] buffer = new byte[(int) size];
            int len = is.read(buffer);

            bufferMId = buffer;


        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Tools.ChangeInto.change(bufferMId);
    }
}