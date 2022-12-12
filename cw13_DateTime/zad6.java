package Zajavka.zadania.cw13_DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zad6 {

    public static void main(String[] args) {

        LocalDateTime warsaw = LocalDateTime.of(2016, 10, 2, 12, 05, 10);

        ZonedDateTime zonedWarsaw = ZonedDateTime.of(warsaw, ZoneId.of("Europe/Warsaw"));

        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime zonedNYC = ZonedDateTime.of(warsaw, ZoneId.of("America/New_York"));


        System.out.println(zonedWarsaw.withZoneSameInstant(ZoneId.of("America/New_York")));
    }
}
