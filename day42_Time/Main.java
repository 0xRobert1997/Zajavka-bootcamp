package Zajavka.days.day42_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

/*        System.out.println(Arrays.toString(Month.values()));

        System.out.println(LocalDateTime.now());

        System.out.println(LocalTime.of(10, 15, 15));

        // pokazuje jaka jest godzina w podanej sekundzie dnia
        System.out.println(LocalTime.ofSecondOfDay(23231));

        System.out.println(LocalTime.MIDNIGHT);*/

/*        LocalDate ld = LocalDate.of(2020,1,20);
        System.out.println("Not manipulated: " + ld);

        System.out.println(ld.plusDays(2));
        System.out.println(ld.plusWeeks(2));
        System.out.println(ld.plusMonths(3));
        System.out.println(ld.plusYears(4));*/

        LocalTime local = LocalTime.of(12, 50, 10);
        // ilość sekund które mineły od północy do tej godziny
        System.out.println(local.toSecondOfDay());

// miesiąc można przekazać przez enum np. Month.MAY przy czym enuma trzeba zaimportować

        // variable.withMonth() podmienia zmienia w podanej dacie tylko miesiąc
    }
}
