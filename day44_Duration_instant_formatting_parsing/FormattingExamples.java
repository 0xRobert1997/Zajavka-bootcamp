package Zajavka.days.day44_Duration_instant_formatting_parsing;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingExamples {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, Month.OCTOBER, 28);
        LocalTime time = LocalTime.of(1, 50);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
        Instant instant = zonedDateTime.toInstant();


        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(date));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(time));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime));

        System.out.println();

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));
        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime));
        System.out.println();


        // customowy formatter:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm z");
        System.out.println("Custom formatter: " + formatter.format(zonedDateTime));

        /*
        y - Year
        M - Month
        d - day
        E - day name
        a - AM/PM
        H - hour
        h - hour in AM/PM
        m - minute
        s - second
         */

    }
}
