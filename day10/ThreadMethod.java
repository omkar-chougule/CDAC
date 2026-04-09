package day10;

public class ThreadMethod {
    public static void main(String [] args) {
        Thread one = new Thread(new Thread2());
        Thread two =  new Thread(new Thread2());

        one.start();
        two.start();
        System.out.println(one.isAlive());
        System.out.println(two.isAlive());

        for (int i = 0; i<10; i++){
            if(i ==2){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+ " : "+ i);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try{
            one.join();
            two.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(one.isAlive());
        System.out.println(two.isAlive());
    }
}
