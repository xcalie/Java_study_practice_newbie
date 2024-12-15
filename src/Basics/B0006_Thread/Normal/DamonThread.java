package Basics.B0006_Thread.Normal;

public class DamonThread implements Runnable{
    @Override
    public void run()
    {
        System.out.println("DamonThread is running");
    }
}
