package A_MULTI_THERADING.practice;

public class UsingThread extends Thread{
    UsingThread(){};
    UsingThread(String name){
        super(name);
    }
    UsingThread(Runnable r){
        super(r);
    }
    UsingThread(Runnable r,String name){
        super(r,name);
    }
    public void run(){
        System.out.println("This is "+Thread.currentThread().getName()+" thread");
    }
    public static void main(String[] args) {
        UsingThread T1 = new UsingThread("VArun");
        T1.start();
        System.out.println(T1.getName());
    }
}
