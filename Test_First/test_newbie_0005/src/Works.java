import java.util.ArrayList;
import java.util.List;

public class Works
{
//    static class Coles
//    {
//        public static byte[] test(byte[] data)
//        {
//            byte[] data_out;
////            for (int i = 0; i < data.length; i++)
////            {
////                System.out.print((char)data[i]);
////            }
////            return data;
//            List<Cube> ret = Tools.ChangeInto.change(data);
//
//
////            return data_out;
//            return data;
//        }
//    }

    static class Cube
    {
        public int id;
        public int sizex;
        public int sizey;
        public int sizez;
        public int weight;

        public double density;

        public Cube()
        {

        }

        public Cube(int id, int sizex, int sizey, int sizez, int weight)
        {
            this.id = id;
            this.sizex = sizex;
            this.sizey = sizey;
            this.sizez = sizez;
            this.weight = weight;
            this.density = this.getDensity();
        }

        public int getVolume()
        {
            return sizex * sizey * sizez;
        }

        public double getDensity()
        {
            return (double)weight / (double)(sizex * sizey * sizez);
        }
    }
}

class Tools
{
    static class ChangeInto
    {
        static void getCube(Works.Cube now,int nowPtr, int nowNum)
        {
            switch (nowPtr)
            {
                case 0:
                    now.id = nowNum;
                    break;
                case 1:
                    now.sizex = nowNum;
                    break;
                case 2:
                    now.sizey = nowNum;
                    break;
                case 3:
                    now.sizez = nowNum;
                    break;
                case 4:
                    now.weight = nowNum;
                    break;
            }
        }
        static List<Works.Cube> change(byte[] data)
        {
            List<Works.Cube> ret = new ArrayList<>();
            int nowPtr = 0;
            int nowNum = 0;
            Works.Cube now = new Works.Cube();
            for (int i = 0; i < data.length; i++)
            {
                if (data[i] == 13 && (char)data[i + 1] == 10)
                {
                    Tools.ChangeInto.getCube(now, nowPtr, nowNum);
                    now.density = now.getDensity();
                    ret.add(now);
                    now = new Works.Cube();

                    i++;
                    nowPtr = 0;
                    nowNum = 0;

                }
                else if ((char)data[i] ==  ' ')
                {
                    Tools.ChangeInto.getCube(now, nowPtr, nowNum);

                    nowPtr++;
                    nowNum = 0;
                }
                else
                {
                    nowNum = nowNum * 10 + (char)data[i] - '0';
                }
            }
            return ret;
        }

        static byte[] changeAway(List<Works.Cube> cubes)
        {
            List<Byte> ret = new ArrayList<>();
            for (Works.Cube cube : cubes)
            {
                int mid;
                List<Byte> middle = new ArrayList<>();


                mid = cube.id;
                do{
                    middle.add((byte)((cube.id % 10) + '0'));
                    cube.id /= 10;
                }while (cube.id > 0);
                cube.id = mid;
                for (int i = middle.size() - 1; i >= 0; i--)
                {
                    ret.add(middle.get(i));
                }
                middle.clear();
                ret.add((byte)32);


                mid = cube.sizex;
                do{
                    middle.add((byte)((cube.sizex % 10) + '0'));
                    cube.sizex /= 10;
                }while (cube.sizex > 0);
                cube.sizex = mid;
                for (int i = middle.size() - 1; i >= 0; i--)
                {
                    ret.add(middle.get(i));
                }
                middle.clear();
                ret.add((byte)32);

                mid = cube.sizey;
                do{
                    middle.add((byte)((cube.sizey % 10) + '0'));
                    cube.sizey /= 10;
                }while (cube.sizey > 0);
                cube.sizey = mid;
                for (int i = middle.size() - 1; i >= 0; i--)
                {
                    ret.add(middle.get(i));
                }
                middle.clear();
                ret.add((byte)32);

                mid = cube.sizez;
                do{
                    middle.add((byte)((cube.sizez % 10) + '0'));
                    cube.sizez /= 10;
                }while (cube.sizez > 0);
                cube.sizez = mid;
                for (int i = middle.size() - 1; i >= 0; i--)
                {
                    ret.add(middle.get(i));
                }
                middle.clear();
                ret.add((byte)32);

                mid = cube.weight;
                do{
                    middle.add((byte)((cube.weight % 10) + '0'));
                    cube.weight /= 10;
                }while (cube.weight > 0);
                cube.weight = mid;
                for (int i = middle.size() - 1; i >= 0; i--)
                {
                    ret.add(middle.get(i));
                }
                middle.clear();
                ret.add((byte)32);

                ret.add((byte)13);
                ret.add((byte)10);
            }
            return Tools.ChangeInto.toByteArray(ret);
        }

        static byte[] toByteArray(List<Byte> ListBuffer)
        {
            byte[] reu = new byte[ListBuffer.size()];

            for (int i = 0; i < ListBuffer.size(); i++)
            {
                reu[i] = ListBuffer.get(i);
            }

            return reu;
        }

        static List<Works.Cube> addSelect(List<Works.Cube> oldCubs, List<Works.Cube> newCubs)
        {
            for (Works.Cube newCube : newCubs)
            {
                if (!oldCubs.contains(newCube))
                {
                    oldCubs.add(newCube);
                }
                else
                {
                    System.out.println("在文件加入中发生了一次重复,已经拒绝加入");
                }
            }
            return oldCubs;
        }


    }


    static class PrintWriter
    {
        static void PrintList(List<Works.Cube> cubes)
        {
            System.out.printf("一共收集到%d\n", cubes.size());
            for (Works.Cube cube : cubes)
            {
                System.out.printf("id:%d,sizex:%d,sizey:%d,sizez:%d,weight:%d\n", cube.id, cube.sizex, cube.sizey, cube.sizez, cube.weight);
            }
        }

    }

}