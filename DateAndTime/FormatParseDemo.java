package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatParseDemo {
    static void main() {
        String mydate = "2026-04-08 12:20:30";

        //pARSING
        LocalDateTime dt = LocalDateTime.parse(mydate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dt);

        //Format: Date to String
        String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/YY hh:mm:ss a"));
        System.out.println(date);


    }
}
