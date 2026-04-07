package Day4;


import Day2.Date;

public class Car implements Cloneable{
    private String model, make;
    private Date mandate;
    private  double price;

    public Car(String model, String make, Date mfg_date, double price) {
        this.model = model;
        this.make = make;
        this.mandate = mfg_date;
        this.price = price;
    }




    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", mandate=" + mandate +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getMandate() {
        return mandate;
    }

    public void setMandate(Date mandate) {
        this.mandate = mandate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow copy: duplicates the Car object, but references still point to same objects.
        Car copy = (Car) super.clone();

        // Deep copy: create a new Date so original and clone do not share the same Date instance.
        copy.mandate = new Date(mandate.getDay(), mandate.getMonth(), mandate.getYear());
        return copy;
    }

    //   - `super.clone()` makes a *shallow copy*:
    //   - Primitive fields (like `double price`) are copied by value.
    //   - Immutable references (like `String`) are safe to share.
    //   - Mutable references (like `Date mandate`) are NOT safe to share.

    // - Because `mandate` is mutable, we deep-copy it after `super.clone()`.
    //   This prevents changes in the original car’s `mandate` from affecting the clone.
}
