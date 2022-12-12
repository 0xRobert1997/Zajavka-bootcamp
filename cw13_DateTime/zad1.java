package Zajavka.zadania.cw13_DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class zad1 {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();

        OffsetDateTime myOffsetDateTime = OffsetDateTime.of(myDateTime, ZoneOffset.of("+04:00"));

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(myOffsetDateTime));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(myOffsetDateTime));
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(myOffsetDateTime) );
        System.out.println(DateTimeFormatter.ISO_OFFSET_TIME.format(myOffsetDateTime));


        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(myOffsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(myOffsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(myOffsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(myOffsetDateTime));
    }
}
