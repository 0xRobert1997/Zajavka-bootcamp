package Zajavka.days.day36_list_arrayList;

import java.util.ArrayList;

public class ListExamples {

    public static void main(String[] args) {

        // Array lista jeśli nie podanym początkowej wielkości to domyślnie jest 10
        // typ musi być klasą, nie może być prymitywem
        ArrayList<String> list = new ArrayList<>();

        // zachodzi autoboxing gdy dodajemy int

        for (int i = 0; i < 10; i++) {
            list.add("string" + i);
        }
        System.out.println(list);



        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Warsaw");
        citiesList.add("Gdańsk");
        citiesList.add("Wrocław");
        System.out.println(citiesList);
        citiesList.add(1, "Szczecin");
        System.out.println(citiesList);

        System.out.println(citiesList.get(0));
        System.out.println(citiesList.get(1));
        System.out.println(citiesList.get(2));
        System.out.println(citiesList.get(3));

        System.out.println(citiesList.size());
        System.out.println(citiesList.isEmpty());

        System.out.println(citiesList.contains("Szczecin"));

//         czysci całą liste
//        citiesList.clear();
//        System.out.println(citiesList);

        // remove albo index albo wartość do usunięcia
        System.out.println(citiesList);
        citiesList.remove(1);
        citiesList.remove("Wrocław");
        System.out.println(citiesList);

    }
}
