package day10.Assignment;

import java.sql.SQLOutput;

public class MyArray {
    public synchronized void printArray(){
        int [] myArray = {10, 20, 30, 40};
        System.out.println("Printing Array");
        for(int i=0; i<myArray.length; i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
