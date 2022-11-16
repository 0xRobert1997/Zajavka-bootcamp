package Zajavka.days.day40_Iterator_convertArrayToList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteringExamples {

    public static void main(String[] args) {

        List<String> listWithCities = new ArrayList<>();
        listWithCities.add("Warszawa");
        listWithCities.add("Gdańsk");
        listWithCities.add("łódź");
        listWithCities.add("Wrocław");

        Iterator<String> iterator = listWithCities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> stringListIterator = listWithCities.listIterator();
        while (stringListIterator.hasNext()) {

        }
    }
}
