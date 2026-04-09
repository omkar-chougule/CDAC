package SL1.Q1;

public class Main {

    static void main() {
        System.out.println();
        System.out.println("----------------------Two Wheeler ------------------------------");
        TwoWheeler tw = new TwoWheeler(1111, "Aprillia", "RS660", 23800000);
        System.out.println(tw);
        double twoWheelerInsurance= tw.calculateInsurance();
        System.out.println("The Insurance of Two Wheeler is "+ twoWheelerInsurance);
        System.out.println();
        System.out.println("-----------------------------Four Wheeler --------------------------");
        FourWheeler fw = new FourWheeler(1112, "Bentley", "", 20000000);
        System.out.println(fw);
        double fourWheelerInsurance = fw.calculateInsurance();
        System.out.println("The Insurance of Four Wheeler is "+ fourWheelerInsurance);
    }
}
