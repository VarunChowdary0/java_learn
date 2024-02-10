package A_MULTI_THERADING;

public class MultithreadDemo extends Thread {
    private int i = 0;

    public void run() {
        while (i < 10) {
            try {
                Thread.sleep(1000);
                i++;
                if (i % 2 == 0) {
                    new Thread(() -> System.out.println("T2: " + (i * i))).start();
                } else {
                    new Thread(() -> System.out.println("T3: " + (i * i * i))).start();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultithreadDemo m = new MultithreadDemo();
        m.start();
    }
    
}
