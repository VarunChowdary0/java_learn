package ThreadCommunication;

public class Item {
    private int val ;
    boolean setVal = false;
    public synchronized void setItem(int i){
        if(setVal){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        val = i;
        System.out.println("Producer placing: "+i);
        notify();
        setVal = true;
    }

    public synchronized int getVal() throws InterruptedException{
        if(!setVal){
            wait();
        }
        System.out.println("Consumer: "+val);
        notify();
        setVal = false;
        return val;
    }
}
