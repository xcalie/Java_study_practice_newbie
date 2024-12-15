package Basics.B0006_Thread.Control;

public class MinPriortyThread implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
