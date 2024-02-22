package A_MULTI_THERADING.practice;

public class UsingRunnable implements Runnable {
    public void run(){
        System.out.println("Thread is running.");
    }
    public static void main(String[] args) {
        UsingRunnable runnable = new UsingRunnable();
        Thread th1 = new Thread(runnable,"This Thread");
        UsingThread Th2 = new UsingThread(runnable,"VARUN");
        th1.start();
        try {
            int i = 10;
            while (i>0) {
                System.out.println(i);
                th1.sleep(1000);
                i--;
                Th2.join();
                System.out.println(Th2.getState());
                if(i == 3){
                    // Th2.start();
                    Th2.run();
                    Th2.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Th2.start(); 
    }
}