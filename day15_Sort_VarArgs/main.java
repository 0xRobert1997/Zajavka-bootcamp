package Zajavka.days.day15_Sort_VarArgs;

public class main {
    public static void main(String... varArgs) {
        int result = 0;
        int[][] arr = {{1, 2, 2}, {5, 0, 7}, {4, 3, 8, 2}};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("1. i: " + i + ", result: " + result);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("2. i: " + i + ", j : " + j + ", result: " + result);
                result += arr[i][j++];
                System.out.println("3. i: " + i + ", j : " + j + ", result: " + result);
            }
            System.out.println("4. i: " + i + ", result: " + result);
            result -= arr[i][0];
            System.out.println("5. i: " + i + ", result: " + result);
        }
        System.out.println(result);
    }
}
