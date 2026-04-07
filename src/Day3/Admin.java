package Day3;

import SL1.Q1.Policy;
import SL1.Q1.Vehicle;
import SL1.Q1.TwoWheeler;
import SL1.Q1.FourWheeler;
public class Admin {
    static void main() {
        Vehicle[] varr = new Vehicle[4];
        varr[0]= new FourWheeler(1001, "Cadillac", "6s", 20000000);
        varr[1]= new TwoWheeler(1002, "Aprillia", "Factory", 3000000);
        varr[2]= new TwoWheeler(1003, "Kawasaki", "ZX10R", 2000000);
        varr[3]= new FourWheeler(1004, "Audi", "R8", 60000000);
        System.out.println("Report");
        for (Vehicle v : varr){
            Policy.displayInsurance(v);
        }
    }
}
