package Zajavka.days.day13_Loops;

public class loopInLoop {
    public static void main(String[] args) {
        int result = 0;
        Label:
        for (int i = 10; i <= 23; i++){
            System.out.println("1. i: " + i + ", res: " + result);
            for (int j = 1; true ; j++) {
                System.out.println("2. i: " + i + ", j " + j + ",res: " + result);
                if (i * j % 3 == 0) {
                    System.out.println("3. i: " + i + ", j " + j + ",res: " + result);
                    continue Label;
                }
                System.out.println("4. i: " + i + ", j " + j + ",res: " + result);
                if (i == 14) {
                    System.out.println("2. i: " + i + ", j " + j + ",res: " + result);
                    break;
                }
                System.out.println("2. i: " + i + ", j " + j + ",res: " + result);
                result ++;
                System.out.println("2. i: " + i + ", j " + j + ",res: " + result);
            }

        } System.out.println(result);
    }
}
