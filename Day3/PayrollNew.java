package Day3;
import Day2.Employee;
import Day2.Employee;
import Day2.SalariedEmployee;

import java.util.Scanner;

public class PayrollNew {
    static Scanner sc = new Scanner(System.in);

    public static void showTax(TaxPayer payer) {

        System.out.println("Tax for : " + " is: " + payer.calculateTax());
    }
}


