package Zajavka.zadania.cw6_arrays;

public class zad8 {
    public static void main(String[] args) {
        int sum = 10;
        int[] arr = new int[]{1, 3, 5, 7, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println("these number gives us sum: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}
