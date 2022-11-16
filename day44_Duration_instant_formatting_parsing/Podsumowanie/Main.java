package Zajavka.days.day44_Duration_instant_formatting_parsing.Podsumowanie;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1410, 7, 15);
        LocalTime localTime = LocalTime.of(8, 50);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDate, localTime, ZoneOffset.of("-05:00"));
        System.out.println(offsetDateTime);

        Instant intstantGrunwaldBattle = offsetDateTime.toInstant();
        System.out.println(intstantGrunwaldBattle);

        System.out.println(intstantGrunwaldBattle.atOffset(ZoneOffset.ofHours(2)));


    }
}
