package Zajavka.days.day42_Time.Podsumowanie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate local = LocalDate.of(20,12,12);
        System.out.println(local);

        // local.minus(5, ChronoUnit.HOURS);
        // daje błąd bo do daty nie można dodać godzin, musiałoby być localDateTime

        // do withMonth trzeba podać inta więc trzeba dać ordinal
        // a numeracja enumów jest od 0 więc enum April ma numer 3 więc trzeba dodać 1
        System.out.println(local.withMonth(Month.APRIL.ordinal() + 1));


        LocalTime localTime = LocalTime.of(20,22,25);
        System.out.println(localTime);


    }
}
