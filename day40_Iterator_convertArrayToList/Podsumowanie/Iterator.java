package Zajavka.days.day40_Iterator_convertArrayToList.Podsumowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Bartek");
        namesList.add("Karol");

        /*        Iterator<String> namesIterator = namesList.iterator();

        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }*/


        ListIterator<String> namesListIterator = namesList.listIterator();
        // drukuje od początku
        while (namesListIterator.hasNext()) {
            System.out.println(namesListIterator.next());
        }

        // drukuje od końca ale TYLKO DLATEGO że we wcześniejszej pętli przeszliśmy do końca
        // więc bez tej poprzedniej pętli ta vv nic by nie wydrukowała
        while (namesListIterator.hasPrevious()) {
            System.out.println(namesListIterator.previous());
        }
    }
}
