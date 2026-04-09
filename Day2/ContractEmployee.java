package Day2;

public class ContractEmployee extends Employee {
    protected double wages ;
    protected int hrs;

    public ContractEmployee(int empid, String name, double wages,int hrs) {
        super(empid, name);
        this.wages = wages;
        this.hrs = hrs;
    }
    @Override
    public double calculateGross(){
        return wages*hrs;
    }

}
