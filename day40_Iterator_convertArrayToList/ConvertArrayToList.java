package Zajavka.days.day40_Iterator_convertArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        Integer[] array = {1, 3, 4, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        list.add(9);

        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));


    }
}
