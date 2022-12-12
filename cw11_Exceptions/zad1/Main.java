package Zajavka.zadania.cw11_Exceptions.zad1;

public class Main {

    public static void main(String[] args) {

        exampleMethod();

    }

    public static void exampleMethod() {
        if (7 == 7) {
            try {
                throw new MyCheckedException("przykladowy tekst");
            } catch (MyCheckedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("This if finally text!");
            }
        }
    }
}
