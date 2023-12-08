class Sender {
    public synchronized void sendMessage(String message) {
        System.out.println("Sending: " + message);
        try {
            Thread.sleep(1000); // Simulate some work being done
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sent:  \t" + message);
    }
}

class ThreadedSend extends Thread {
    private String message;
    private Sender sender;

    public ThreadedSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    @Override
    public void run() {
        sender.sendMessage(message);
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend("welcome", snd);
        S1.setName("Sq");

        ThreadedSend S2 = new ThreadedSend("welcome 2", snd);
        S2.setName("Sq");

        ThreadedSend S3 = new ThreadedSend("welcome 3", snd);
        S3.setName("Sq");

        S1.start();
        S2.start();
        S3.start();

        try {
            S1.join();
            S2.join();
            S3.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
