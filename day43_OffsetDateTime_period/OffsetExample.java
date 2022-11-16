package Zajavka.days.day43_OffsetDateTime_period;

import java.time.*;

public class OffsetExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 10, 10);
        LocalTime localTIme = LocalTime.of(20, 12, 2);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTIme);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(2));



    }
}
