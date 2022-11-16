package Zajavka.days.day26_enums;

import java.util.Arrays;

public class Enums  {

    public static void main(String[] args) {

        Volkswagen v = getV1();
        System.out.println(v);
        System.out.println(v.getifMissing());
        System.out.println(Volkswagen.ARTEON.doSomething());


        // w enumie nie można nadpisać metody equals
        System.out.println(Arrays.toString(Volkswagen.values()));
    }

    private static Volkswagen getV2() {
        return Volkswagen.TUAREG;
    }

    private static Volkswagen getV1() {
        return Volkswagen.ARTEON;
    }

}
