package Threading.l2;

public class main {
    public static void main(String[] args) {
        Countdown thread1 = new Countdown();
        countDownThread tr1 = new countDownThread(thread1);
        tr1.setName("pehla");

        Countdown thread2 = new Countdown();
        countDownThread tr2 = new countDownThread(thread2);
        tr2.setName("dusra");

        tr1.start();
        tr2.start();

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

        for(i = 10; i > 0; i --) {
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }

        /*
         when multiple threads are working they share same object instance
         i.e if onw of them changes value of the instance then it remains changed

         Threads share the heap
         Local variables such as used in loops are unique for each thread in its thread stack
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


