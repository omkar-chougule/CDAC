package day10;

public class DemoSynchronization {
    public static void main(String [] args){
        CounterJob job = new CounterJob();
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.start();
        t2.start();
    }
}
