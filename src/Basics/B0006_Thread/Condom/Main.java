package Basics.B0006_Thread.Condom;

public class Main {
    public static void main(String[] args)
    {
        Condom condom = new Condom();
        Thread t1 = new Thread(new Producer(condom), "生产者");
        Thread t2 = new Thread(new Customer(condom), "消费者");

        t1.start();
        t2.start();

    }
}
