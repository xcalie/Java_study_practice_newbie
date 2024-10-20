import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 省略炒饭检测 异常捕获

        System.out.println("输入字符串:");
        Chars str1;

        str1 = new Chars(sc.nextLine());
        System.out.println("数字个数:" + str1.NumberNum);
        System.out.println("大写字母个数:" + str1.CharCapitalNUm);
        System.out.println("小写字母个数:" + str1.CharLowerNum);
        System.out.println("其他字符个数:" + str1.OtherNum);

        System.out.println("\n输入子串:");
        String str2 = sc.nextLine();
        int[] same = Chars.StringSame(str1.str, str2);

        for (int i = 0; same[i]!= -1; i++)
        {
            System.out.print(same[i] + " ");
        }

        String str3 = str1.reversalString(str1.str);
        System.out.println("反转完成");
        System.out.println(str3);

        System.out.println("再次寻找" + str2);
        same = Chars.StringSame(str3, str2);
        for (int i = 0; same[i]!= -1; i++)
        {
            System.out.print(same[i] + " ");
        }

    }
}


class Chars
{
    public String str;

    public int NumberNum;
    public int CharCapitalNUm;
    public int CharLowerNum;
    public int OtherNum;

    public Chars()
    {
        NumberNum = 0;
        CharCapitalNUm = 0;
        CharLowerNum = 0;
        OtherNum = 0;
        str = "";
    }
    public Chars(String str)
    {
        this.str = str;
        StringFoundAll(this.str.toCharArray());
    }


    public void StringFoundAll(char[] str)
    {
        for (char c : str)
        {
            if (c >= '0' && c <= '9')
            {
                NumberNum++;
            }
            else if (c >= 'A' && c <= 'Z')
            {
                CharCapitalNUm++;
            }
            else if (c >= 'a' && c <= 'z')
            {
                CharLowerNum++;
            }
            else
            {
                OtherNum++;
            }


        }
    }


    public static int[] StringSame(String strLong, String strShort)
    {
        int[] target = new int[1000];
        int i = 0;                      // 记录下标
        int cutedNumber = 0;            // 记录裁剪的长度
        int index;                      // 记录位置
        // 深拷贝防止被修改
        String strLongcopy = new String(strLong);
        do
        {
            index = strLongcopy.indexOf(strShort);
            target[i++] = index + cutedNumber;
            cutedNumber += index + 1;
            strLongcopy = strLongcopy.substring(index + 1);
        }while (index != -1);
        target[i - 1] = -1;
        return target;
    }


    public String reversalString(String str)
    {
        char[] strArray = str.toCharArray();
        char[] restrArray = new char[strArray.length];
        for (int i = 0; i < strArray.length; i++)
        {
            restrArray[i] = strArray[strArray.length - i - 1];
        }
        return new String(restrArray);
    }

}
