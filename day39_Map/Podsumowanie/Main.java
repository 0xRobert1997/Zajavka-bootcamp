package Zajavka.days.day39_Map.Podsumowanie;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> citiesAttractions = new HashMap<>();

        List<String> warsawAttreaction = new ArrayList<>();
        warsawAttreaction.add("PalacKultury i Nauki");
        warsawAttreaction.add("Metro Politechnika");

        citiesAttractions.put("Warsaw", warsawAttreaction);
        citiesAttractions.put("London", List.of("London Eye", "Buckingham Palace"));


        //var citiesAttractionKeys = citiesAttractions.values();

        for (List<String> citiesAttractionValue : citiesAttractions.values()) {

            //System.out.println(citiesAttractionValue);
            for (String atrr : citiesAttractionValue) {
               System.out.println(atrr);
            }
        }




    }
}




