package DateAndTime;

import java.time.*;
import java.util.Set;

public class DemoZone {
    static void main() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println(zones);

//        LocalTime now = LocalTime.now();
//        LocalDateTime t1 = now.atDate(LocalDate.now());
//        System.out.println(t1);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime ist = now.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(ist);

//        ZonedDateTime Lst = now.atZone(ZoneId.of("Pacific/Kwajalein"));
//        System.out.println(Lst);
        now = ist.toLocalDateTime();
        System.out.println(now);

        ZonedDateTime nyc = now.atZone(ZoneId.of("America/New_York"));
        System.out.println(nyc);

        nyc = ist.toInstant().atZone(ZoneId.of("America/New_York"));
        System.out.println(nyc);

        LocalDateTime istlocal = ist.toLocalDateTime();
        LocalDateTime nyclocal = nyc.toLocalDateTime();

        Duration diff = Duration.between(istlocal, nyclocal);
        System.out.println(diff.toHoursPart() + "hrs" + diff.toMinutesPart() + "Mins");


    }

}
