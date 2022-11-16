package Zajavka.days.day13_Loops;

public class loops {
    public static void main(String[] args) {
        first_loop:
        for (int i = 0; i < 4; i++) {
            System.out.println("first_loop: i = " + i);
            second_loop:
            for (int j = 0; j < 4; j++) {
                System.out.println("second_loop: j = " + j);
                third_loop:
                for (int k = 0; k < 4; k++) {
                    if (j == 2) {
                        System.out.println("continue j == 2");
                        continue first_loop;
                    }
                    if (k == 1) {
                        System.out.println("break k == 1");
                        break second_loop;
                    }
                    System.out.println("third_loop i = " + i + ", j = " + j + ", k = " + k);
                }

            }

        }


    }

}
