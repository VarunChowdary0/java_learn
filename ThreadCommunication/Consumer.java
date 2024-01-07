package ThreadCommunication;

public class Consumer extends Thread {
    private Item item;
    public Consumer(Item item){
        this.item =item;
    }
    public void run(){
        while (true) {
            try{
                sleep(500);
                int temp = item.getVal();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
