package Zajavka.days.day34_InitblockExceptions_Finally.Podsumowanie;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            Ship ship = new Ship("Shippek");
            if (true) {
                throw new RuntimeException("My new exception");
            }
        } catch (RuntimeException e) {
            System.out.println("Catch.");
        }  finally {
            System.out.println("Finally.");
        }
        System.out.println("After finally");
    }
}
