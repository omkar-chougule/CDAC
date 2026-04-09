package Day3;
import Day2.Manager;
import Day2.SalariedEmployee;

public class TestInheritance {
    public static void main(String [] args){
        SalariedEmployee se = new SalariedEmployee(334,"aaa",60000);
        Manager me = new Manager(5656, "ppp", 80000,20000);
        Consultant c = new Consultant();

        PayrollNew.showTax(se);
        PayrollNew.showTax(me);
        PayrollNew.showTax(c);
    }
}
