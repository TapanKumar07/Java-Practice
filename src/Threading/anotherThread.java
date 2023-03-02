package Threading;

public class anotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running Thread " + Thread.currentThread().getName());
        try{
            System.out.println("Sone jaa ra");
            Thread.sleep(3500);
            System.out.println("sone do yaaaaar");

        } catch(InterruptedException e) {
            System.out.println("Kisne jgaya bhai ko !?");
            return;
        }
        System.out.println("Bhai 3 second ruk ke aaya hu run hone de");
    }
}
