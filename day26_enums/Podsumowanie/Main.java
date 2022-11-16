package Zajavka.days.day26_enums.Podsumowanie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String resolvedEnum = "FROG";

        System.out.println(Arrays.toString(Animal.values()));
        Animal resultValue = Animal.valueOf(resolvedEnum);

        System.out.println(resultValue);
        System.out.println(resultValue.getMessage());



        int resolvedEnumIndex = 3;
        // ordinal musi być wowołany na konkretnej wartości enuma
        int someOrdinal = Animal.CROCODILE.ordinal();
        // wydrukuje pokzycje crocodile, czyli licząć od 0 będzie 2
        System.out.println(someOrdinal);


        // wydrukuje wartość enuma z pozycji podanej w resolvedEnumIndex
        Voicable resolvedValue = Animal.values()[resolvedEnumIndex];
        System.out.println(resolvedValue);

        // animal values zwraca tablice więc trzeba dać arrays.ToString
        System.out.println(Arrays.toString(Animal.values()));


        for (Voicable voicable : Animal.values()) {
            System.out.println(voicable + ": " + voicable.makeVoice());
        }

        System.out.println();
    }
}
