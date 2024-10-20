import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] Building = new int[Solution.numberMaxFloor][];
        Building[0] = new int[]{1};
        Building[1] = new int[]{1,1};

        Scanner sc = new Scanner(System.in);

        System.out.println("输入层数");
        int floor = sc.nextInt();
        System.out.println("创建完毕");

        Solution.Builder(Building,floor);
        Solution.Printer(Building,floor);

        System.out.println("进阶2输入层阶与位数");
        int floor2 = sc.nextInt();
        int digit2 = sc.nextInt();
        Solution.Builder(Building,floor2 + 1);
        System.out.println(Building[floor2][digit2]);
    }
}

class Solution {
    public static int numberMaxFloor = 99999;

    public static void Builder(int[][] Building,int floor)
    {
        for (int i = 2; i < floor; i++)
        {
            int[] Downfloor = new int[i + 1];
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    Downfloor[j] = 1;
                    continue;
                }
                Downfloor[j] = Building[i - 1][j] + Building[i - 1][j - 1];
            }
            Building[i] = Downfloor;
        }
        //return Building;
    }


    public static void Printer(int[][] Building, int floor)
    {
        for (int i = 0; i < floor; i++)
        {
            for (int j = floor; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(Building[i][j] + " ");
            }
            System.out.println();
        }
    }

}