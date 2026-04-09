package Day5;

import java.util.Set;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String name;
    private double salary;
    private Set<String > skills;

    public Employee(int empid, String name, double salary, Set<String> skills) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        return this.empid - o.empid;
        return Integer.compare(this.empid,o.empid);
    }
}
