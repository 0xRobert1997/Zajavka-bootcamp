package Zajavka.zadania.cw6_arrays;

import java.util.Arrays;

public class zad4 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 2, 3, 3, 5, 6, 7, 8, 8};
        int [] duplicatesArr = new int[arr.length / 2];
        int duplicateIndex = 0;

        for (final int element: arr) {
            if (elementDuplicatedIn(arr, element) && !elementPresentIn(duplicatesArr, element, duplicateIndex)) {
                duplicatesArr[duplicateIndex] = element;
                duplicateIndex++;
            }
        }

        int[] duplicatesArrResized = new int[duplicateIndex];
        assignArray(duplicatesArrResized, duplicatesArr);
        System.out.println("Duplicates " + Arrays.toString(duplicatesArr));
        System.out.println("Duplicates resized " + Arrays.toString(duplicatesArrResized));

    }
    private static boolean elementDuplicatedIn(final int[] arr, final int elementToCheck) {
        int counter = 0;
        for (int element : arr) {
            counter = element == elementToCheck ? counter + 1 : counter;
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean elementPresentIn(final int[] duplicatesArr, final int elementToCheck, final int duplicateIndex){
        int  index = 0;
        for (int element : duplicatesArr) {
            if (index == duplicateIndex) {
                break;
            }
            if (element == elementToCheck){
                return true;
            }
            index++;
        }
        return false;
    }

    private static void assignArray(final int[] duplicatesArrResized, final int[] duplicatesArr) {
        for (int i = 0; i < duplicatesArrResized.length; i++) {
            duplicatesArrResized[i] = duplicatesArr[i];
        }
    }
}
