package MultiThreading_class.Synchronize;

public class SyncDemo_22 {
    public static void main(String[] args) {
        Sender_112 snd  = new Sender_112();
        ThreadSender_34 s1 = new ThreadSender_34("Welcome 1" ,snd);

        ThreadSender_34 s2 = new ThreadSender_34("Wlecome wefj 2" ,snd);

        ThreadSender_34 s3 = new ThreadSender_34("  123 abq wekb 3" ,snd);
        ThreadSender_34 s4 = new ThreadSender_34(" ewfyh*8y8x 897 4" ,snd);

        ThreadSender_34 s5 = new ThreadSender_34("  qwfer ef b 5" ,snd);

        s1.start();
        s2.start();
        s3.start(); // random ;
        s4.start();
        s5.start();
    }
}
