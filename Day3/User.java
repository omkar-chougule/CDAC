package Day3;
import Day2.Employee;
import Day2.Manager;
import Day2.Month;
import Day2.SalariedEmployee;
import Day2.ContractEmployee;
import Day2.Employee;


public class User {
    public static void main(String [] args){
        SalariedEmployee se = new SalariedEmployee(334,"aa", 60000);
        Payroll.showGross(se);

        Employee e = new Manager(5656,"ppp", 80000,20000);
        //Upcasting : super class refernce refers to sub class object
        System.out.println(e.calculateGross());
//        e.calculateNet(); //wont work because Employee class does not implement calculateNet()
//        SalariedEmployee s = (SalariedEmployee) e;
        Manager t = (Manager) e;
//        System.out.println( s.calculateNet());
        System.out.println( t.calculateNet());
        //super class collections can be used to store all object data
        Employee [] emps= new Employee[2];
        emps[0]=new SalariedEmployee(450,"sss",50000);
        emps[1]=new Manager(7867,"mmm",90000,25000);
        for (Employee emp : emps){
            Payroll.showGross(emp);
            if(emp instanceof Manager){
                Payroll.showNet((SalariedEmployee) emp);
            }

        }

    }

}
