package Zajavka.days.day31_Exceptions.Podsumowanie;

public class Except {

    public static void main(String[] args) {
        // Exception - typ wyjątku
        // male e - nazwa zmiennej
        try {
            exceptionalMethod();
            System.out.println("middle");
        } catch (java.lang.Exception e) {

        }
    }

    public static void exceptionalMethod() throws java.lang.Exception {
        throw new java.lang.Exception("My exception message");
    }
}
