package A_MULTI_THERADING;

public class ThreadPriority_233 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Thread is Running ");
    }
    public static void main(String[] args) {
        ThreadPriority_233 R1 = new ThreadPriority_233();
        ThreadPriority_233 R2 = new ThreadPriority_233();
        ThreadPriority_233 R3 = new ThreadPriority_233();
        CreatingAndStartingThread T1 = new CreatingAndStartingThread(R1,"Thread 1");
        CreatingAndStartingThread T2 = new CreatingAndStartingThread(R2,"Thread 2");
        CreatingAndStartingThread T3 = new CreatingAndStartingThread(R3,"Thread 3");

        T1.start();
        T2.start();
        T3.start();;

        System.out.println(T1.getName()+" Priority is: "+T1.getPriority());
        System.out.println(T1.getName()+" MIN_Priority is: "+T1.MIN_PRIORITY);
        System.out.println(T1.getName()+" MIN_Priority is: "+T1.MAX_PRIORITY);
        System.out.println(T1.getName()+" MIN_Priority is: "+T1.NORM_PRIORITY);
        System.out.println(T2.getName()+" Priority is: "+T2.getPriority());
        System.out.println(T2.getName()+" MIN_Priority is: "+T2.MIN_PRIORITY);
        System.out.println(T2.getName()+" MIN_Priority is: "+T2.MAX_PRIORITY);
        System.out.println(T2.getName()+" MIN_Priority is: "+T2.NORM_PRIORITY);
        System.out.println(T3.getName()+" Priority is: "+T3.getPriority());
        System.out.println(T3.getName()+" MIN_Priority is: "+T3.MIN_PRIORITY);
        System.out.println(T3.getName()+" MIN_Priority is: "+T3.MAX_PRIORITY);
        System.out.println(T3.getName()+" MIN_Priority is: "+T3.NORM_PRIORITY);
    }
}
