package Basics.B0006_Thread.Normal;

public class XCThread implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
