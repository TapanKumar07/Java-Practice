package Threading;

public class main {
    public static void main(String[] args) {

        /*
         -Thread - unit within a process. each process can have multiple threads for I/o, memory mmgmt
         -Every thread created by process shares process's memorey and files
         -Each thread has its own stack
         -every java appl runs as a single process

         Why use threads
         -time taking tasks

         -It is after the system to schedule when the thread will run
         -We are not allowed to start same instance of thread moree than once
         */

         Thread a= new anotherThread();
         a.setName("== Another Thread ==");
         a.start();




         Thread runa = new Thread(new myRunnable() {
             @Override
             public void run() {
                 System.out.println("Anonyomous running thread!");
                 try {
                     a.join(2000); //isko jaga diya ab jab tak ye complete na ho jaye waiting...
                     System.out.println(" I am alive again : )");
                 } catch(InterruptedException e) {
                     System.out.println("I am interrupted!!");
                 }
             }
         });

         a.interrupt();
         //most developers use runnable interface method bcoz many APIs in java wants runnable
        // interface passed  through them

        //thread will terminate when it returns from run method
        //calling directly run method will make it run on main thread


        //we might want to stop executing some thread or sleep for sometime
         runa.start();


         /*
         join() functioinality
         there wont be any data to process until threads fetching the data completes its execution
         so in this case rather than waking up thread to see if there is any data we can actually
         join these two thread so that this thread will be executed after first one has terminated
          */


    }
}
