package Zajavka.zadania.cw12_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zad2 {
    //Napisz program, który losowo zamieni kolejność elementów w podanej liście. Do osiągnięcia efektu
    //losowości spróbuj wykorzystać klasę Random. Wiem, że nie poruszaliśmy jej w materiałach, dlatego
    //postaraj się wykorzystać google żeby znaleźć przykłady jej użycia. Od razu wyjaśnię, że robię to w
    //ten sposób, żeby

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Random random = new Random();

        list.add("kot");
        list.add("pies");
        list.add("papuga");
        list.add("pawian");

        int length = list.size();


        for (int i = 0; i < length; i++) {
            int swap = i + random.nextInt(length - i);

            String temp = list.get(i);

            list.set(i, list.get(swap));
            list.set(swap, temp);
        }

        System.out.println(list);




    }
}
