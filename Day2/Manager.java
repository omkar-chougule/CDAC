package Day2;

import Day3.TaxPayer;
import jdk.jshell.MethodSnippet;

public class Manager extends SalariedEmployee {
    double allowance;

    public Manager(int empid, String name, double basic, double allowance){
        super (empid, name, basic);
        this.allowance=allowance;
    }
    @Override
    public double calculateGross(){
        return super.calculateGross() + allowance;
    }
    @Override
    public double calculateNet(){
        return this.calculateGross()*0.8;
    }
}
