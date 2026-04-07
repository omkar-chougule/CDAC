package Day2;
import Day2.Date;
import java.util.Scanner;
import Day2.Month;

public class Calendar {
    public  static void main(String[] args){
        int i=10;
        Date d1  =new Date(10, "JAN", 2000);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter month (3 letters)");
        String month =sc.next();
        Month mm= Month.valueOf(month.toUpperCase());
        Date d2= new Date(2, "jan", 2000);
        System.out.println(d1);
        System.out.println(d2);

        d1.displayDate();
        d2.displayDate();
        Date d3 = new Date(2, "jan", 2000);
        d3.setDay(-1);
        d3.displayDate();
    }
}
