package Zajavka.days.day43_OffsetDateTime_period;

import java.time.*;

public class ZonedExample {

    public static void main(String[] args) {

/*        System.out.println("ZoneId.getAvailableZoneIds: " + ZoneId.getAvailableZoneIds());
        System.out.println("ZonedId.of: " + ZoneId.of("Poland"));
        System.out.println("ZonedId.systemDefault: " + ZoneId.systemDefault());

        System.out.println(ZonedDateTime.now(ZoneId.of("Poland")));*/


        ZoneOffset utc = ZoneOffset.UTC;
        ZoneId usPacific = ZoneId.of("US/Pacific");
        ZoneId paris = ZoneId.of("Europe/Paris");

        LocalDate localDate = LocalDate.of(2020, 10, 10);
        LocalTime localTime = LocalTime.of(20, 12, 2);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("ZonedDateTime.of: " + ZonedDateTime.of(localDate, localTime, utc));
        System.out.println("ZonedDateTime.of: " + ZonedDateTime.of(localDateTime, utc));
        System.out.println("ZonedDateTime.of: " + ZonedDateTime.of(localDateTime, usPacific));
        System.out.println("ZonedDateTime.of: " + ZonedDateTime.of(localDateTime, paris));
    }
}
