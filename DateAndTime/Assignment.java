package DateAndTime;

import java.sql.SQLOutput;
import java.time.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Assignment {
    static void main() {
        //Find Out all the months that start on a Sunday in year 2025
//        int years = 2025;
//        System.out.println("Months in " + years + " that start on Sunday:");
//        for(int month = 1; month<=12; month++){
//            LocalDate firstDayOfMonth = LocalDate.of(years, month, 1);
//            if(firstDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY){
//                System.out.println(firstDayOfMonth.getDayOfYear());
//            }
//        }

        Stream<LocalDate> fullyear = LocalDate.of(2025,1,1).datesUntil(LocalDate.of(2025,12,1));
        Predicate<LocalDate> sunday =(d) -> d.getDayOfWeek().equals(DayOfWeek.SUNDAY);

        Predicate<LocalDate> the1st = (d) -> d.getDayOfMonth() == 1;
        // Consume the stream properly
        fullyear.filter(the1st).filter(sunday).forEach(System.out::println);



        //iF WE LEAVE MUMBAI AT 02:05 AM AND ARRIVE IN NEW YORK AT 8:40 AM. HOW LONG IS THE FLIGHT?
        // Define zones
        ZoneId mumbaiZone = ZoneId.of("Asia/Kolkata");
        ZoneId newYorkZone = ZoneId.of("America/New_York");

        // Departure and arrival times
        LocalDate flightDate = LocalDate.of(2026, 4, 8); // example date
        LocalDateTime departureLocal = LocalDateTime.of(flightDate, LocalTime.of(2, 5));
        LocalDateTime arrivalLocal = LocalDateTime.of(flightDate, LocalTime.of(8, 40));

        ZonedDateTime departure = departureLocal.atZone(mumbaiZone);
        ZonedDateTime arrival = arrivalLocal.atZone(newYorkZone);

        Duration flightDuration = Duration.between(departure.toInstant(), arrival.toInstant());

        System.out.println("Flight duration: " + flightDuration.toHours() + " hours "
                + (flightDuration.toMinutes() % 60) + " minutes");
    }

}
