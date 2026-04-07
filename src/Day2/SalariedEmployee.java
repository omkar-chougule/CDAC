package Day2;
import Day3.TaxPayer;
public class SalariedEmployee extends Employee implements TaxPayer{

    protected double basic ;

    public SalariedEmployee(int empid, String name, double basic) {
        super(empid, name);
        this.basic = basic;
    }


    @Override
    public double calculateGross() {
        double hra = basic * 0.4;
        double da = basic * 0.12;
        return basic + hra + da;
    }

    public double calculateNet(){
//        return this.calculateGross()*(1-0.2);
        return calculateGross() - calculateTax();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "basic=" + basic +
                ", name='" + name + '\'' +
                ", empid=" + empid +
                '}';
    }

    @Override
    public double calculateTax(){
        return calculateGross()*0.2;
    }
}
