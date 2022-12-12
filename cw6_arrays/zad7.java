package Zajavka.zadania.cw6_arrays;

public class zad7 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 8, 4, 5, 6};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i + 1]) && arr[i] < max) {
                secondMax = arr[i];
            }

        }
        System.out.println("max : " + max);
        System.out.println("second max: " + secondMax);
    }
}