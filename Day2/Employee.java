package Day2;

public abstract class Employee {
    protected int empid;
    public String name;

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public abstract double calculateGross();

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                '}';
    }
}
