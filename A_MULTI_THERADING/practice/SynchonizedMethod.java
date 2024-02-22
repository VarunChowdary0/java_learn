package A_MULTI_THERADING.practice;

class TestinClass{
    synchronized void M(){
        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class SynchonizedMethod {
    public static void main(String[] args) {
        TestinClass Test = new TestinClass();
        Thread t1 = new Thread("Thread_1"){
            public void run(){
                Test.M();
            }
        };
        Thread t2 = new Thread("Thread_2"){
            public void run(){
                Test.M();
            }
        };
        Thread t3 = new Thread("Thread_3"){
            public void run(){
                Test.M();
            }
        };

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
