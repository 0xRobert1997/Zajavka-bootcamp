package Zajavka.zadania.cw12_collections.zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zad4 {

    // Napisz metodę, która na podstawie przekazanej do niej listy Integerów, przeniesie najwyższą
    //wartość na koniec listy. Stwórz 2 wersje metody, pierwszą modyfikującą obecną listę, drugą
    //zwracającą nową listę. Jeżeli wartość maksymalna się powtarza, napisz kod w ten sposób, żeby na
    //końcu listy pojawiło się tylko jedno wystąpienie tej wartości, a zniknęło ono z oryginalnych miejsc.

    public static void main(String[] args) {

        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(20);
        newList.add(15);
        newList.add(20);
        newList.add(8);
        newList.add(9);
        System.out.println(newList);
        myMethod2(newList);

    }

    public static void myMethod(List<Integer> myList) {
        int max = 0;
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(i) > myList.get(j) && myList.get(i) > max){
                    max = myList.get(i);
                }
            }
        }
        int index = myList.indexOf(max);
        int lastIndex = myList.size() - 1;
        int lastValue = myList.get(lastIndex);
        myList.set(lastIndex, max);
        myList.set(index, lastValue);
    }

    public static void myMethod2(List<Integer> myList) {
        List<Integer> newList2 = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            newList2.add(myList.get(i));
        }

        int max = 0;
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(i) > myList.get(j) && myList.get(i) > max){
                    max = myList.get(i);
                }
            }
        }
        int index = myList.indexOf(max);
        int lastIndex = myList.size() - 1;
        int lastValue = myList.get(lastIndex);

        newList2.set(lastIndex, max);
        newList2.set(index, lastValue);
        System.out.println(newList2);
    }
}
