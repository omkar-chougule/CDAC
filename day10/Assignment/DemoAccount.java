package day10.Assignment;

public class DemoAccount {
    public static void main(String args []){
        Account a1 = new Account(101, "Mangesh", 900);

        Thread t1;
        {
            t1 = new Thread(() -> {
                a1.withdrawl(1000);
            });
        }

        Thread t2;
        {
            t2 = new Thread(() -> {
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                a1.deposit(4000);
            });
        }

        t1.start();
        t2.start();
    }
}
