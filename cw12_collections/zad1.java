package Zajavka.zadania.cw12_collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class zad1 {
    // Mając Set z elementami typu String, wydrukuj na ekranie każdy element oddzielony przecinkiem
    //przy wykorzystaniu iteratora.

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("jeden");
        mySet.add("dwa");
        mySet.add("trzy");
        mySet.add("cztery");

        Iterator<String> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }

        }

    }
}
