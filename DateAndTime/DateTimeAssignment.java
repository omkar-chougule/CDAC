package DateAndTime;

import java.time.*;

public class DateTimeAssignment {
    //Calculate Your age in no of days, months, years
    public static void main(String [] args){
        LocalDate birthdate = LocalDate.of(2003, 11, 28);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);
        System.out.println("Days: " + age.getDays() +" " + "Month : " + age.getMonths() + "Year : "+ " " + age.getYears());

    //Compute programmers day without using plusDays
        int year = 2026;

        LocalDate programmerDay = LocalDate.ofYearDay(year, 256);
        System.out.println("Programmers Day in " + programmerDay + " of Year " + year);

     //Find Out all the months that start on a Sunday in year 2025
        int years = 2025;
        System.out.println("Months in " + years + " that start on Sunday:");
        for(int month = 1; month<=12; month++){
            LocalDate firstDayOfMonth = LocalDate.of(years, month, 1);
            if(firstDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.println(firstDayOfMonth.getDayOfYear());
            }
        }


    }

}
