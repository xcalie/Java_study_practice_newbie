package Basics.B0006_Thread.Normal;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NikeThread implements Runnable{
    private int count = 100;

    //锁对象
    //private Object lock = new Object();

    //同步锁
    Lock reentrantLock = new ReentrantLock();
    //同步锁具有确定顺序
    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "：抢到了第" + count-- + "双鞋");
            }
            reentrantLock.unlock();
        }
    }

//    @Override
//    public void run() {
//        while (true) {
//            nikeCatch();
//        }
//    }

    // 同步方法

//    public synchronized void nikeCatch() {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if (count > 0) {
//            System.out.println(Thread.currentThread().getName() + "：抢到了第" + count-- + "双鞋");
//        }
//    }
}
