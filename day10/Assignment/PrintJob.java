package day10.Assignment;

public class PrintJob {
    public static void main(String [] args){
        MyArray ma = new MyArray();

//        System.out.println("Thread 1");
        Thread t1;
        {
            t1 = new Thread(() -> {
                ma.printArray();
            });
        }

//        System.out.println("Thread 2");

        Thread t2;
        {
            t2 = new Thread(() -> {
                ma.printArray();
            });
        }

        t1.start();
        t2.start();
    }


}
