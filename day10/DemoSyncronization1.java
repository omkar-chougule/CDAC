package day10;

public class DemoSyncronization1 {
    public static void main(String [] args){
        Counter c = new Counter();
        Thread  t1;

        {
            t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (c){
                        for(int i=0; i<50; i++){
                            c.increment();
                            System.out.println(Thread.currentThread().getName()+ " " + c.getCount());
                            try{
                                Thread.sleep(500);

                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

        }

        Thread t2;
        {
            t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (c){
                        for(int i=0; i<50; i++){
                            c.increment();
                            System.out.println(Thread.currentThread().getName()+ " " + c.getCount());
                            try{
                                Thread.sleep(500);

                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
            t1.start();
            t2.start();
        }
    }

}
