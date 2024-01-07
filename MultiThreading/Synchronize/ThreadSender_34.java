package MultiThreading.Synchronize;

public class ThreadSender_34 extends Thread {
    private String msg ;
    Sender_112 sender;

    ThreadSender_34(String m,Sender_112 Obj){
        msg = m;
        sender = Obj;
    }
    public void run(){
        // synchronized(sender){
            
        // }
        sender.send(msg);
    } 
}
