package A_MULTI_THERADING;

class Customer{
    int amount = 1000;

    synchronized void withDraw(int amount){
        System.out.println("With drawing ............ ");
        if (amount > this.amount){
            System.out.println("Less amount waiting to Deposite. Current balance :"+amount);
            try{
                wait();
            }
            catch(Exception e){

            }
            this.amount -= amount;
            System.out.println("Withdraw complete... Current balance :"+amount);
        }
    }

    synchronized void Deposite(int amount){
        System.out.println("Depositing ........... ");
        this.amount+=amount;
        System.out.println("Depositing Complete ........... Current balance:"+amount);
        notify();
    }
}

public class SynchronisedExample {
    public static void main(String[] args) {
        final Customer customer = new Customer();

        Thread withdraw = new Thread(){
            public void run(){
                customer.withDraw(5000);
            }
        };

        withdraw.start();

        Thread deposite = new Thread(){
            public void run(){
                customer.Deposite(10000);
            }
        };

        deposite.start();
    }
}
