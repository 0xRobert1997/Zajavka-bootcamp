package Zajavka.days.day45_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

    public static void main(String[] args) {

        // predykat może przyjąć dowolny typ
        // i ma tylko metodę test która zwraca boolean

        java.util.function.Predicate<String> ifEmptyFilter = (s) -> {
            System.out.println("checking: " + s);
            return s.isEmpty();
        };

        List<String> list = new ArrayList<>();
        list.add("Warka");
        list.add("Parka");

        System.out.println(list);
        list.removeIf(ifEmptyFilter);
        System.out.println(list);



    }
}
