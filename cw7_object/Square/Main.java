package Zajavka.zadania.cw7_object.Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        exercise3();
    }

    public static void exercise3() {
        Square[] squares = new Square[]{
                new Square(2),
                new Square(3),
                new Square(2),
                new Square(4),
                new Square(3),
                new Square(6),
                new Square(),
                new Square(),
        };
        System.out.println(Arrays.toString(squares));
        Square[] deduplicate = deduplicateAndSort(squares);
        System.out.println(Arrays.toString(deduplicate));
    }
        
        private static Square[] deduplicateAndSort(Square[] arr) {
            sort(arr);
            int sizeOfNonDuplicates = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (!arr[i].equals(arr[i + 1])) {
                    sizeOfNonDuplicates++;
                }
            }

            int length = arr.length;
            
            Square[] temp = new Square[sizeOfNonDuplicates];
            int j = 0;
            for (int i = 0; i < length - 1; i++) {
                if (!arr[i].equals(arr[i + 1])) {
                    temp[j++] = arr[i];
                }
            }
            temp[j] = arr[length - 1];
            return temp;
        }

        private static void sort(final Square[] arr) {
            Square temp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].area() > arr[j].area()) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
        }
        
        





    
}
