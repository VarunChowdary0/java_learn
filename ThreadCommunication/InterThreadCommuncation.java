package ThreadCommunication;
public class InterThreadCommuncation {
    public static void main(String[] args) {
        Item i = new Item();
        Producer producer = new Producer(i);
        Consumer consumer = new Consumer(i);
        producer.start();
        consumer.start();
    }
}
