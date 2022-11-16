package Zajavka.days.day44_Duration_instant_formatting_parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parse {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2020-03-15");
        LocalDateTime dateTime = LocalDateTime.parse("2020-03-15T11:50:55");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-03-15T10:15:30+01:00[Europe/Paris]");


        String stringDate = "Mon, 05 May 1980";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        System.out.println(LocalDate.parse(stringDate, formatter));


    }
}
