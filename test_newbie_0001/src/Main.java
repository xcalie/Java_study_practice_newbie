import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("输入数组长度:");
        int[] numbers = new int[sc.nextInt()];
        System.out.println("输入数组:");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.println("输入target:");
        int target = sc.nextInt();


        Number sample = new Number(numbers);
        System.out.println(sample.FoundNumber_DivideInto2(target, 0, sample.size - 1));


    }
}


class Number
{
    int[] numbers;
    int size;

    public Number(int... numbers)
    {
        this.numbers = numbers;
        this.size = numbers.length;
    }

    public int FoundNumber_DivideInto2(int target, int left, int right)
    {
        if (left == right)
        {
            return (target == this.numbers[left]) ? left : -1;
        }

        boolean mid = (right % 2 == 1) && (left % 2 == 1);
        int middle = (left / 2) + (right / 2) + (mid ? 1 : 0);
        // 优先从左端寻找
        int index1 = FoundNumber_DivideInto2(target, left, middle);
        int index2 = FoundNumber_DivideInto2(target, middle + 1, right);

        return index1 == -1 ? index2 : index1;
    }

}