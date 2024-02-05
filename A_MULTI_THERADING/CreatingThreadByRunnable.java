package A_MULTI_THERADING;

public class CreatingThreadByRunnable implements Runnable {

    public void run(){
        System.out.println("Thread is Running....");
    }
    public static void main(String[] args) {
        CreatingThreadByRunnable r1 = new CreatingThreadByRunnable();
        CreatingAndStartingThread t1 = new CreatingAndStartingThread(r1, "Im Varun");

        t1.start();
        System.out.println(t1.getName());
    }
}
