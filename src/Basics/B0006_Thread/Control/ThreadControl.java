package Basics.B0006_Thread.Control;

public class ThreadControl {
    public static void main(String[] args) {
        //线程调度
        //每一个线程都是公平的，先获得先跑

        //线程的优先级，可以决定线程的调度顺序，但是不能保证绝对
        //系统是轮流获得
        //Java抢占CPU

        //1-10 main() 主线程 value = 5

        //main 5
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Thread.currentThread().getName());
//        }

        Thread maxThread = new Thread(new MaxPriortyThread(), "maxThread");
        Thread minThread = new Thread(new MinPriortyThread(), "minThread");

        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);

        maxThread.start();
        minThread.start();
    }
}
