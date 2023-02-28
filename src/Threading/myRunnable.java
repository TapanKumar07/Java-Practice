package Threading;

public class myRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from runnable interface thread");
//        try{
//            anotherThread.join();
//        }catch (InterruptedException e) {
//            System.out.println("I was interrupted!");
//        }
    }
}
