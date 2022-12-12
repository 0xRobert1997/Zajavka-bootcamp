package Zajavka.zadania.cw12_collections.zad6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zad6 {
    public static void main(String[] args) {

        List<Square> squareList = new ArrayList<>();
        squareList.add(new Square(5));
        squareList.add(new Square(15));
        squareList.add(new Square(5));
        squareList.add(new Square(10));
        squareList.add(new Square(10));

        Set<Square> squareSet = new HashSet<>();

        squareSet.addAll(squareList);

        System.out.println(squareSet);
    }
}
