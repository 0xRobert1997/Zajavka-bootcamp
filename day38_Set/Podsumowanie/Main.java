package Zajavka.days.day38_Set.Podsumowanie;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // remove zwraca boolean czy udało prawda że usuneło czy nieprawda jeśli takiego elementu nie było w secie
        //System.out.println(setOfIntegers.remove(7));


        Set<Integer> set1 = new HashSet<>();
        set1.add(8);
        set1.add(10);

        Set<Integer> set2 = new HashSet<>();
        set2.add(8);
        set2.add(11);

        // łączenie na 2 sposoby
/*        Set<Integer> resultSet1 = new HashSet<>(set1);
        resultSet1.addAll(set2);

        albo

        Set<Integer> resultSet1 = new HashSet<>(set1);
        resultSet1.addAll(set1);
        resultSet1.addAll(set2);*/

        // w set1 zostawiamy tylko to co jest w set2
        /*set1.retainAll(set2);
        System.out.println(set1);*/



        Set<Book> bookSet = new HashSet<>();
        Book iJava = new Book("Ogniem i Javą");
        System.out.println(iJava.hashCode());
        bookSet.add(iJava);
        iJava.setTitle("Wodą i Javą");
        System.out.println(iJava.hashCode());
        bookSet.add(iJava);

        System.out.println(bookSet);


    }
}
