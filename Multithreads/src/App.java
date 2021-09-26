public class App {
    public static void main(String[] args) throws Exception {
        //multithreading = Process of executing multiple threads simultaneaously
        //                 Helps maximum utilization of CPU
        //                 Threads are independent, the don't affect the execution of each other
        //                 An exception in one thread will not interrupt other threads
        //                 useful for serving multiple clients, multiplayer games, or other mutually independent


        //Create a subclass of Thread
        MyThread thread1 = new MyThread();

        //or

        // implement Runnable interface and pass intance as an argument to Thread
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(1000); //calling thread(ex.main) wait until the specified thread dies or a specify amount of seconds
        thread2.start();
        //System.out.println(1/0);
    }
}
