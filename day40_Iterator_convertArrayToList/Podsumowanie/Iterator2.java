package Zajavka.days.day40_Iterator_convertArrayToList.Podsumowanie;

import java.util.*;
import java.util.Iterator;

public class Iterator2 {

    public static void main(String[] args) {

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Bartek");
        namesSet.add("Karol");

        Iterator<String> namesIterator = namesSet.iterator();


        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());

        }


        Map<String, String> map = new HashMap<>();
        map.put("one", "Bartek");
        map.put("zero", "Karol");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }




    }
}
