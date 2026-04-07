package Day3;

import Day2.Date;

import java.util.Objects;

public class Cars {
    private String model, make, mfg_date;

    public Cars(String model, String make, String mfg_date) {
        this.model = model;
        this.make = make;
        this.mfg_date = mfg_date;
    }

    public String getMfg_date() {
        return mfg_date;
    }

    public void setMfg_date(String mfg_date) {
        this.mfg_date = mfg_date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", mfg_date='" + mfg_date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(model, cars.model) && Objects.equals(make, cars.make) && Objects.equals(mfg_date, cars.mfg_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, make, mfg_date);
    }
}
