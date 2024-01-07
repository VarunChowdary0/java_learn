package ThreadCommunication;

public class Producer extends Thread {
    private Item item;
    int i;
    public Producer(Item item){
        this.item = item;
    }
    public void run(){
        while (true) {
            try{
                sleep(1000);
                item.setItem(i++);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
