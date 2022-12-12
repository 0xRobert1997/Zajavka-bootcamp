package Zajavka.zadania.cw12_collections.zad8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zad8 {
    //Stwórz mapę Map<Integer, String>, która zawiera imiona i nazwiska uczniów w klasie razem z ich
    //numerami w dzienniku. Następnie stwórz listę imion i nazwisk, uczniów, którzy mają w dzienniku
    //numery w zakresie od a (inclusive) do b (exclusive).

    public static void main(String[] args) {

        Map<Integer, String> Uczniowie = new HashMap<>();
        Uczniowie.put(1, "Marcin Kowalczyk");
        Uczniowie.put(2, "Tomek Podkowa");
        Uczniowie.put(3, "Kazik Kazicki");
        Uczniowie.put(4, "Ada Cempa");
        Uczniowie.put(5, "Marcin Julkowski");
        Uczniowie.put(11, "Maciej Maciejski");
        Uczniowie.put(12, "Bartek Bartkowski");
        Uczniowie.put(13, "Tomek Tomallowski");
        Uczniowie.put(14, "Darek Darecki");
        Uczniowie.put(15, "Seba Sebilski");
        Uczniowie.put(16, "Michal Zdzichalski");

        List<String> listaDo10 = new ArrayList<>();
        List<String>listaOd10 = new ArrayList<>();

        for (Integer integer : Uczniowie.keySet()) {
            if(integer < 11) {
                String temp = Uczniowie.get(integer);
                listaDo10.add(temp);
            }
            else {
                String temp = Uczniowie.get(integer);
                listaOd10.add(temp);
            }
        }
        System.out.println("Lista do numeru 10: " + listaDo10);
        System.out.println("Lista od numeru 10: " + listaOd10);



    }




}
