package A_MULTI_THERADING.practice;

/*
    * Thread synchronization three types
    * -> mutual exclusive  [synchronized method, synchronized block , static synchronization]
    * -> inter-thread-communication
*/
class Sender{
    void sendMessage(String msg){
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(msg);
    }
}

class TestSynchornization extends Thread{
    private String message;
    Sender sender;
    TestSynchornization(String msg,Sender s){
        this.message = msg;
        this.sender = s;
    }
    public void run(){
        synchronized(sender){       // synchronized block
            sender.sendMessage(message);
        }
    }
}
public class ThreadCommm_sync {
    public static void main(String[] args) {
        Sender sender = new Sender();
        TestSynchornization T1 = new TestSynchornization("Hi", sender);
        TestSynchornization T2 = new TestSynchornization("Hello There", sender);
        TestSynchornization T3 = new TestSynchornization(" He heee. ...", sender);
        T1.start();
        T2.start();
        T3.start();
        try{
            T1.join();
            T2.join();
            T3.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}