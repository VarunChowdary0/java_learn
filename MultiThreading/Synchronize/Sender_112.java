package MultiThreading.Synchronize;

public class Sender_112 {
    public synchronized void send(String msg){
        System.out.print("[ "+ msg);
        try{
            Thread.sleep(2500);
        }
        catch(Exception e){
            System.out.print("Thread interrupted.");
        }
        System.out.println(" ]");
    }
}
