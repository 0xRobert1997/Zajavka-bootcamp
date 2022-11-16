package Zajavka.days.day47_BigInteger_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Big_Decimal {

    public static void main(String[] args) {

        BigDecimal bigd1 = BigDecimal.valueOf(124.12312);
        BigDecimal bigd2 = BigDecimal.valueOf(54544.12312);
        BigDecimal bd3 = bigd1.add(bigd2);

        // przy dzieleniu trzeba w nawiasie po przecinku podać zaokrąglenie
        System.out.println(bigd1.divide(bigd2, RoundingMode.HALF_DOWN));

        // dzielenie jest tricky, licznik(pierwsza liczba) musi być z kropką
        // setScale to ile cyfr po przecinku ma pokazać
        BigDecimal bd1 = BigDecimal.valueOf(10).setScale(10, RoundingMode.HALF_UP);
        BigDecimal bd2 = BigDecimal.valueOf(3);
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP));


        // pow - power - potęga
        bd1.pow(4);


        System.out.println(bd2.negate());




    }
}
