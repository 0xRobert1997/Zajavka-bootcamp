package Zajavka.days.day47_BigInteger_decimal;

import java.math.BigInteger;

public class Big_Integger {

    public static void main(String[] args) {

        BigInteger bigInteger1 = BigInteger.ZERO;
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigInteger3 = BigInteger.TWO;
        BigInteger bigInteger4 = BigInteger.TEN;

        BigInteger bi1 = BigInteger.valueOf(123);
        BigInteger bi2 = BigInteger.valueOf(1231213);
      //  BigInteger bi3 = bi1.add(bi2);

        BigInteger bi = new BigInteger("1231231231");
        System.out.println(bi);

        // nie zwraca boolean'a!
        int i = bi1.compareTo(bi2);

        BigInteger bo = BigInteger.valueOf(1);

    }
}
