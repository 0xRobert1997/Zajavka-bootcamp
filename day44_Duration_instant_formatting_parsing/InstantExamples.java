package Zajavka.days.day44_Duration_instant_formatting_parsing;

import java.time.*;

public class InstantExamples {

    public static void main(String[] args) {

        // Instant.ofEpochSecond(2302301L);

        ZoneId zone1 = ZoneId.of("Europe/Belgrade");

        LocalDate date1 = LocalDate.of(2020, 11, 20);
        LocalTime time1 = LocalTime.of(20,15,20);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date1, time1, zone1);

        System.out.println(zonedDateTime.toEpochSecond());

        Instant instantOriginal = Instant.ofEpochSecond(zonedDateTime.toEpochSecond());
        // jeśli w period damy więcej niż 0 w years lub months to wywali błąd
        Instant instantPeriod = instantOriginal.plus(Period.of(0,0,2));
        Instant instantDuration = instantOriginal.plus(Duration.ofHours(78));

        System.out.println(instantPeriod.isAfter((instantOriginal)));
        System.out.println(instantDuration.isBefore(instantOriginal));

    }
}
