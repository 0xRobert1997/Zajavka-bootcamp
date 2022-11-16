package Zajavka.days.day37_LinkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        linkedList.add("Warsaw");
        linkedList.add("Gdańsk");
        linkedList.add("Wrocław");


        System.out.println(linkedList);
        linkedList.add(2, "Białystok");


    }
}
