package SL1.Q1;

public class FourWheeler extends Vehicle {
    public FourWheeler(int registration_no, String make, String model, double price) {
        super(registration_no, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        return price*0.01;
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "registration_no=" + registration_no +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
