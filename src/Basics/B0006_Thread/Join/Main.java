package Basics.B0006_Thread.Join;

import Basics.B0006_Thread.Normal.XCThread;

public class Main {
    public static void main(String[] args)
    {
        XCThread xcThread = new XCThread();

        Thread t1 = new Thread(xcThread, "1");
        //线程插队

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        //Main

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
