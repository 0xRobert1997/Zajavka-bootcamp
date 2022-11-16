package Zajavka.days.day44_Duration_instant_formatting_parsing;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExamples {

    // duration operuje tylko mili i nano sekundach, więc jak da się więcej niż 24h to i tak poda w godzinach, nie zamieni na dni

    // duration drukuje na początku PT a period same P
    public static void main(String[] args) {

        Duration duration = Duration.ofDays(1);
        duration = duration.withSeconds(123);
        System.out.println("Duration: " + duration);

        LocalDate localDate1 = LocalDate.of(2020, 10, 20);
        LocalDate localDate2 = LocalDate.of(2020, 11, 20);
        LocalTime localTime1 = LocalTime.of(20,15,20);
        LocalTime localTime2 = LocalTime.of(23,10,27);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);

        // between
        System.out.println(Duration.between(localDateTime1, localDateTime2));
        // lub
        System.out.println(ChronoUnit.DAYS.between(localDate1, localDate2));

        Duration duration2 = Duration.between(localTime1, localTime2);
        System.out.println(duration2.getUnits());
        // nie da się wyciągnąć dni ani minut
        System.out.println(duration2.getSeconds());

        System.out.println(duration2);
        // truncatedTo - obcięte do
        System.out.println(duration2.truncatedTo(ChronoUnit.HOURS));
        System.out.println(duration2.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(duration2.truncatedTo(ChronoUnit.SECONDS));
    }
}
