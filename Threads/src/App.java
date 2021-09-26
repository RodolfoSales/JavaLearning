public class App {
    public static void main(String[] args) throws Exception {
        /*
         thread = A thread of execution in a program
            the JVM allows an application to have multiple threads running
            Each thread can execute parts of your code in parallel with the main thread
            Each thread has a priority
            Threads with higher priority are executed in preference compare to lower ones

            The Java Virtual Machine continues to execute threads until either of the following occurs
             1. The exit method of class Runtime has benn called
             2. All user threads have died
            
             When a JVM starts up, there is a thread which calls the main method
             This thread is called "main"
             Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
             JVM terminates itself when all user threads (non-daemon threads) finish their execution
        */

        //System.out.println(Thread.activeCount());
        //Thread.currenThread().setName("Rodolfo"); 
        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setPriority(10); 0 até 10
        //System.out.println(Thread.currentThread().getPriority()); 
        //System.out.println(Thread.currentThread().isAlive());
        //for (int i = 3; i > 0; i--) {
        //    System.out.println(i);
        //    Thread.sleep(1000);
        //}
        
        MyThread thread =  new MyThread();
        thread.start();
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
        //System.out.println(thread.isAlive());
        //System.out.println(thread.getName());

    }
}
