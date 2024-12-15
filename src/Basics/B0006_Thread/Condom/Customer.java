package Basics.B0006_Thread.Condom;

public class Customer extends Thread{
    private Condom condom;

    public Customer(Condom condom){
        this.condom = condom;
    }

    @Override
    public void run(){
        while(true){
            synchronized (condom){
                if (!condom.isStatic){
                    try {
                        // 客户无就等待生产者
                        condom.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                condom.isStatic = false;

                System.out.println("顾客消费了");

                condom.notify();
            }
        }
    }
}
