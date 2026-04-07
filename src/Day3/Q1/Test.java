package Day3.Q1;

import SL1.Q1.FourWheeler;
import SL1.Q1.TwoWheeler;

import java.util.Scanner;

public class Test {
    static void main() {
        Taxi t1 = new Taxi(1001,"Rolls Roys", "R1", 50000000);

        Bus b1 = new Bus(111,"rollsRoy", "r1", 40000000);
//        Taxi t1 = new Taxi(1001,"Rolls Roys", "R1", 50000000);
//        Taxi t1 = new Taxi(1001,"Rolls Roys", "R1", 50000000);

        Scanner sc = new Scanner(System.in);
        int hrs = sc.nextInt();
        System.out.println(t1.rent(hrs));


    }
}
//TwoWheeler tw = new TwoWheeler(1111, "Aprillia", "RS660", 23800000);
//        System.out.println(tw);
//double twoWheelerInsurance= tw.calculateInsurance();
//        System.out.println("The Insurance of Two Wheeler is "+ twoWheelerInsurance);
//        System.out.println();
//        System.out.println("-----------------------------Four Wheeler --------------------------");
//FourWheeler fw = new FourWheeler(1112, "Bentley", "", 20000000);
//        System.out.println(fw);
//double fourWheelerInsurance = fw.calculateInsurance();
//        System.out.println("The Insurance of Four Wheeler is "+ fourWheelerInsurance);