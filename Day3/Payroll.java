package Day3;

import Day2.Employee;
import Day2.Month;
import Day2.SalariedEmployee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Payroll {

    public static void showGross(Employee e){
        System.out.println("Gross Salary for : " +e.name +": "+e.calculateGross());
    }

    public static void showNet(SalariedEmployee e){
        System.out.println("Net Salary for  : " +e.name+ e.calculateNet());
    }
}
