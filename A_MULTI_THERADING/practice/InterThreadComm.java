package A_MULTI_THERADING.practice;

import java.util.Scanner;

class ProducerConsumer{
    void produce() throws InterruptedException{
        synchronized(this){
            System.out.println("Producer running ............");
            wait();
            System.out.println("Product Produced");
            System.out.println("Producer Resumed");
            System.out.println("-----------------------------------------------------");
        }
    }

    void consume() throws InterruptedException{
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        synchronized(this){
            System.out.println("Press any Key to Place Order ...");
            sc.nextLine();
            System.out.println("Prodicing");
            notify();
            Thread.sleep(2000);
        }
    }
}

public class InterThreadComm {
   public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(){
            public void run(){
                try{
                    while (true) {
                        pc.consume();
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try{
                    while (true) {
                        pc.produce();
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
