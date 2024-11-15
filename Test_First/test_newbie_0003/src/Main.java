import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入数组长度:");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        System.out.println("输入数组:");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }

        Numbers Nums = new Numbers(numbers);
        NumberPair[] results = Nums.FoundNumberPair();

        Printer.Print(results, Printer.peek(results));
    }
}

class Numbers
{
    public int[] numbers;
    public Numbers(int... numbers)
    {
        this.numbers = numbers;
        sortNums(true);
    }

    public void sortNums(boolean flag)
    {
        // 冒泡排序
        // 1为正序
        // 0为倒序
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (flag)
                {
                    if (numbers[i] > numbers[j])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
                else
                {
                    if (numbers[i] < numbers[j])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
    }

    public NumberPair[] FoundNumberPair()
    {
        NumberPair[] pairs = new NumberPair[numbers.length];
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = numbers.length - 1; j > i; j--)
            {
                for (int k = i; k < j; k++)
                {
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                    {
                        pairs[i] = new NumberPair(numbers[i], numbers[j], numbers[k]);
                    }
                }
            }
        }
        return pairs;
    }
}

class NumberPair
{
    int Num1;
    int Num2;
    int Num3;
    public NumberPair(int num1, int num2, int num3)
    {
        this.Num1 = num1;
        this.Num2 = num2;
        this.Num3 = num3;
    }
}


class Printer
{
    public static int peek(NumberPair[]numbers)
    {
        int index = 0;
        for (NumberPair np : numbers)
        {
            if (np != null)
            {
                index++;
            }
        }
        return index;
    }


    public static void Print(NumberPair[] numbers, int length)
    {
        System.out.print("[");
        for(int i = 0; i < length - 1; i++)
        {
            System.out.print("[" + numbers[i].Num1 + "," + numbers[i].Num2 + "," + numbers[i].Num3 + "]");
            System.out.print(",");
        }
        System.out.print("\b]");
    }
}