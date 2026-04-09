package SL1.Q1;

public abstract class Vehicle {
    protected int registration_no;
    protected String make;
    protected String model;
    protected double price;

    public Vehicle(int registration_no, String make, String model, double price) {
        this.registration_no = registration_no;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public abstract double calculateInsurance();
}
