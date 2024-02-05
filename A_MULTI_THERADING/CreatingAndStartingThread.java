package A_MULTI_THERADING;

public class CreatingAndStartingThread extends Thread {
    CreatingAndStartingThread(){}
    CreatingAndStartingThread(String name){
        super(name);
    }
    CreatingAndStartingThread(Runnable r){
        super(r);
    }
    CreatingAndStartingThread(Runnable r,String name){
        super(r,name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Thread is Running ");
    }
    public static void main(String[] args) {
        CreatingAndStartingThread th = new CreatingAndStartingThread("Varun");
        th.start();
        System.out.println(th.getName());
   }
}
