package Zajavka.zadania.cw13_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class zad5 {

    public static void main(String[] args) {

        LocalDate local1 = LocalDate.now();
        LocalDate local2 = LocalDate.of(2022, 9, 1);

        System.out.println(Period.between(local1, local2));
    }
}
