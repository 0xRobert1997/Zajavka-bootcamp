package Zajavka.zadania.cw13_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class zad3 {

    public static void main(String[] args) {

        LocalDate myDateTime = LocalDate.of(2012, 06, 24);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM");

        System.out.println(customFormatter.format(myDateTime));

        // albo

        System.out.println(myDateTime.getMonth());

    }
}
