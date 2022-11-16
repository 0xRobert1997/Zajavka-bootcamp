package Zajavka.days.day15_Sort_VarArgs;

import java.util.Arrays;

public class SortedXor {
    public static void main(String[] args) {


        int[] arr = {4, 6, 1, 2, 5};

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j] ^(arr[j] = arr[i]);

                }


            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

