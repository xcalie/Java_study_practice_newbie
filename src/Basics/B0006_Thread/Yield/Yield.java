package Basics.B0006_Thread.Yield;

import Basics.B0006_Thread.Normal.XCThread;

public class Yield {
    public static void main(String[] args) {
        XCThread xcThread = new XCThread();

        Thread t1 = new Thread(xcThread, "1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 5) {
                Thread.yield();
            }
        }
    }
}
