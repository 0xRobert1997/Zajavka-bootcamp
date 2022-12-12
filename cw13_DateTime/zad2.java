package Zajavka.zadania.cw13_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class zad2 {


    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2018, 05, 06);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE");

        System.out.println(customFormatter.format(myDate));

        // albo

        System.out.println(myDate.getDayOfWeek());

    }
}
