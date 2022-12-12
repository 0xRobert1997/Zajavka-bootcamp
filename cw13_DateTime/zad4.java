package Zajavka.zadania.cw13_DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class zad4 {

    public static void main(String[] args) {

        LocalDateTime local = LocalDateTime.now();

         Duration duration = Duration.of(Instant.now().getEpochSecond(), ChronoUnit.SECONDS);
        System.out.println(duration);
        System.out.println(Period.ofDays((int) duration.toDays()));

    }
}
