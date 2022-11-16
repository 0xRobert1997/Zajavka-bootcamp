package Zajavka.days.day40_Iterator_convertArrayToList.Podsumowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConvert {

    public static void main(String[] args) {

        String[] namesArray = {"one", "Two", "Three", "Four"};
        List<String> namesList = new ArrayList<>(Arrays.asList(namesArray));

        System.out.println(Arrays.toString(namesArray));
        System.out.println(namesList);

        namesList.add("Five");

        List<String> myList = new ArrayList<>(List.of(namesArray));
        System.out.println(myList);
        myList.add("kekw");
        System.out.println(myList);


    }
}
