package Day3.Q1;

import SL1.Q1.FourWheeler;

public class Taxi extends FourWheeler implements Rentable {
    public Taxi (int registration_no, String make, String model, double price){
        super(registration_no, make, model, price);
    }

    @Override
    public double rent(int hrs) {
        if( hrs < 3){
            return hrs*300;
        }
        else{
            return 900+(hrs-3)*400;
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registration_no=" + registration_no +
                '}';
    }
}
