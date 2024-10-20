import java.util.List;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main
{

    public static void main(String[] args)
    {
        SolutionIoFile.InBuilder();     //从文件中抓取数据

        List<Works.Cube> cubes =SolutionIoFile.Done();      //抓取数据


        proces(cubes);


        SolutionIoFile.OutBuilder(cubes);  //结束操作时返回数据
    }

    public static void proces(List<Works.Cube> cubes)
    {
        Tools.PrintWriter.PrintList(cubes);
        for (int i = 5; i >= 0; i--)
        {
            System.out.printf("%d秒后跳转", i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print('\r');
        }

        clear();

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任意字符继续,除了q以外");
        String ch = scanner.next();

        clear();

        while (!ch.equals("q"))
        {
            System.out.println("输入q结束进程\n输入login插入新的方块\n输入check查询已有方块\n输入fix修改方块\n输入delete删除方块\n输入clear清除所有方块\n");
            ch = scanner.next();

            switch (ch)
            {
                case "login":
                    System.out.println("请按顺序输入");
                    Works.Cube NewCube = new Works.Cube();
                    System.out.print("编号:");
                    NewCube.id = scanner.nextInt();
                    for (Works.Cube cube : cubes)
                    {
                        if (cube.id == NewCube.id)
                        {
                            System.out.println("id重复,加入失败");
                            waitZ();
                            break;
                        }
                    }
                    System.out.print("长,宽,高以及重量:");
                    NewCube.sizex = scanner.nextInt();
                    NewCube.sizey = scanner.nextInt();
                    NewCube.sizez = scanner.nextInt();
                    NewCube.weight = scanner.nextInt();
                    cubes.add(NewCube);
                    System.out.println("插入成功");
                    waitZ();
                    break;
                case "check":
                    Tools.PrintWriter.PrintList(cubes);
                    waitZ();
                    break;
                case "fix":
                    System.out.println("请输入要修改的id");
                    int id1 = scanner.nextInt();
                    for (Works.Cube cube : cubes)
                    {
                        if (cube.id == id1)
                        {
                            System.out.println("请输入新的长宽高以及重量");
                            cube.sizex = scanner.nextInt();
                            cube.sizey = scanner.nextInt();
                            cube.sizez = scanner.nextInt();
                            cube.weight = scanner.nextInt();
                            System.out.println("修改成功");
                            waitZ();
                            break;
                        }
                    }
                    System.out.println("修改失败请输入正确的id");
                    waitZ();
                    break;
                case "delete":
                    System.out.println("请输入要删除的id");
                    int id2 = scanner.nextInt();
                    cubes.remove(id2);
                    System.out.println("删除成功");
                    waitZ();
                    break;
                case "clear":
                    cubes.clear();
                    System.out.println("清除成功");
                    waitZ();
                    break;
                case "q":
                    return;
                default:
                    System.out.println("输入错误,这里没有炒饭");
                    waitZ();
                    break;
            }

            clear();
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }

    public static void waitZ()
    {
        for (int i = 5; i >= 0; i--)
        {
            System.out.printf("%d秒后跳转", i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print('\r');
        }

    }

}



