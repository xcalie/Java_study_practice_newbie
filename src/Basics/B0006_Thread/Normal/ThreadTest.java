package Basics.B0006_Thread.Normal;


public class ThreadTest {

    public static void main(String[] args) {
        NikeThread nikeThread = new NikeThread();
        DamonThread damonThread = new DamonThread();

        // 后台线程
        Thread dThread = new Thread(damonThread);
        dThread.setDaemon(true);
        dThread.start();
        System.out.println(dThread.isDaemon());

        // 前台线程
        new Thread(nikeThread, "张三").start();
        new Thread(nikeThread, "李四").start();
        new Thread(nikeThread, "王五").start();
    }
}
