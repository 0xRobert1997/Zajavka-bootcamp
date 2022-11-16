package Zajavka.days.day40_Iterator_convertArrayToList.Podsumowanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> namesList = new ArrayList<>();
        namesList.add("Czarek");
        namesList.add("Marek");
        namesList.add("Darek");
        namesList.add("Arek");


        Cat cat = new Cat(namesList);

        System.out.println(cat.getFriendsNames());

        cat.getFriendsNames().add("Jarek");

        System.out.println(cat.getFriendsNames());
    }
}
