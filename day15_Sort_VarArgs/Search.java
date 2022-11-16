package Zajavka.days.day15_Sort_VarArgs;

public class Search {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 5, 5, 5};
        printIndexOfArraysElem(array, 5);
        printIndexesOfArraysElem(array, 5);

    }

    private static void printIndexOfArraysElem(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void printIndexesOfArraysElem(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                System.out.println(i);
            }
        }
    }
}