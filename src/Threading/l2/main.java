package Threading.l2;

public class main {
    public static void main(String[] args) {
        Countdown thread1 = new Countdown();
        countDownThread tr1 = new countDownThread(thread1);
        tr1.setName("pehla");

       // Countdown thread2 = new Countdown();
        countDownThread tr2 = new countDownThread(thread1);
        tr2.setName("dusra");

        tr1.start();
        tr2.start();
        /*
        Synchroniuzation -> Java provides us the way of when can a thread change value in the heap
         when a method is synchronized all the other threads will wait until current thread execution
         is finished -> prevents therad interfernece
         */
    }
}

class Countdown {

    private int i ;
    public void doCountdown() {
        String color;
        System.out.println(Thread.currentThread().getName());

        switch(Thread.currentThread().getName()) {
            case "pehla":
                color = ThreadColor.ANSI_BLUE;
                break;

            case "dusra":
                color = ThreadColor.ANSI_GREEN;
                break;

            default :
                color = ThreadColor.ANSI_YELLOW;
        }

        /*
        This refers to current entity that is accessing this block so acts like a LOCK
        In case of static methods and objects lock is owned by class object/instance

        If a thread aquires a object's lock then in synchronized code if it is using some other
        synchornized code that uses same object the thread can continuw executing

        critical section refers to code that uses some shared resource like a variable

        when is Thread safe -> When developers ensure that they have maintained synchronzed code
        and there will be no thread interference then it is said to be thread safe
         */
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }

        /*
         when multiple threads are working they share same object instance
         i.e if onw of them changes value of the instance then it remains changed

         Threads share the heap
         Local variables such as used in loops are unique for each thread in its thread stack


         Intrinsic lock -> any thread can hold the lock at a time so other threads wait

         Dont use local variables to synchronize!!!!!!
         local variables are stored in thread stack and therefore unique to thread


         ArrayList is not thread safe
         vector class is synchronized


         wait() -> if a thread calls it, it cause current thread to release the lock and
         wait until another thread invokes notify/notifyAll

         notify() -> wake up a single thread and releases object lock
         */
    }

}

class countDownThread extends Thread{

    private Countdown countdownn;

    countDownThread(Countdown c) {
        countdownn = c;
    }
        @Override
        public void run() {
            countdownn.doCountdown();
        }
}


