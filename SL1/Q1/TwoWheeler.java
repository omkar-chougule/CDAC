package SL1.Q1;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(int registration_no, String make, String model, double price) {
        super(registration_no, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        return price * 0.05;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "registration_no=" + registration_no +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
