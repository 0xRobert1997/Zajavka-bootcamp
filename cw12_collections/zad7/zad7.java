package Zajavka.zadania.cw12_collections.zad7;

import java.util.*;

public class zad7 {

    //Napisz metodę, która przyjmuje jako argument String i wydrukuje na ekranie, ile razy wystąpiła
    //dana litera (znak) w podanym zdaniu.

    public static void main(String[] args) {

        exercise7("mamatata");
    }


    public static void exercise7(String a) {

        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            Character myCharacter = a.charAt(i);
            characterList.add(myCharacter);
        }

        Set<Character> characterSet = new HashSet<>(characterList);
        Map<Character, Integer> charactersMap = new HashMap<>();




        for (Character character : characterList) {
            int counter = 0;
            for (Character character1 : characterList) {
                if (character.equals(character1)){
                    counter++;
                }
            }
            charactersMap.put(character, counter);
        }
        System.out.println(charactersMap);
    }
}

