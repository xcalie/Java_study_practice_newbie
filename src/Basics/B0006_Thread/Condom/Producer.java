package Basics.B0006_Thread.Condom;

public class Producer extends Thread{
    private Condom condom;

    public Producer(Condom condom){
        this.condom = condom;
    }

    @Override
    public void run(){
        while(true){
            synchronized (condom){
                if (condom.isStatic){
                    try {
                        // 生产者有就等待顾客
                        condom.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                condom.isStatic = true;

                System.out.println("生产者生产了一个Condom");

                condom.notify();
            }
        }
    }
}
