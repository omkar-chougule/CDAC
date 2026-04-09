package Day3.Q1;

import SL1.Q1.FourWheeler;

public class Bus extends FourWheeler implements Rentable {
    public Bus(int registration_no, String make, String model, double price){
        super(registration_no, make, model, price);
    }
    public double rent(int hrs){
        if( hrs < 3){
            return hrs*500;
        }
        else{
            return 1500+(hrs-3)*200;
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", registration_no=" + registration_no +
                '}';
    }
}
