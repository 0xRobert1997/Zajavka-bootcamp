package Zajavka.zadania.cw5_loops;

public class zad8 {

    public static void main(String[] args) {

        print();
    }

    private static void print() {
        for (int i = 111; i < 1000; i+= 111) {
            System.out.println(i);
            for (int j = 0; j < 4; j++) {
                System.out.println("####");
            }
        }
    }
}
