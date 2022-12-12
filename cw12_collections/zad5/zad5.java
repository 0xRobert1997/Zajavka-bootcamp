package Zajavka.zadania.cw12_collections.zad5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zad5 {

    //Stwórz listę zawierającą 100 liczb. Spróbuj wykorzystać klasę Random do wygenerowania wartości
    //losowych w zakresie od 0 do 10 (klasa ta została wspomniana w zadaniach poprzednich). Następnie
    //wydrukuj na ekranie ile razy każdy z elementów został wylosowany. Wykorzystaj Map.

    public static void main(String[] args) {

        List<Integer> myIntegerList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            myIntegerList.add(rand.nextInt(10));
        }

        System.out.println(myIntegerList);

        int toCheck = 1;
        int counter = 0;

        for (Integer integer : myIntegerList) {
            if (integer == toCheck) {
                counter++;
            }
        }
        System.out.println("Integer: " + toCheck + " has been drawn " + counter + " times.");

    }
}
