package Zajavka.days.day47_BigInteger_decimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Podsumowanie {

    public static void main(String[] args) {


        // żeby dać ze stringa to musi być new
        BigDecimal bigDec1 = BigDecimal.valueOf(123.00);
        BigDecimal bigDec2 = new BigDecimal("123.00");
        // różnią się ilością zer przy wydrukowaniu
        // co sprawi że equals nie zadziała
        System.out.println(bigDec1);
        System.out.println(bigDec2);
        // żeby obejść problem trzeba użyć setScale
        BigDecimal bd1 = BigDecimal.valueOf(123.00).setScale(2, RoundingMode.UP);
        BigDecimal bd2 = new BigDecimal("123.00").setScale(2, RoundingMode.UP);
        System.out.println(bd1);
        System.out.println(bd2);





    }
}
