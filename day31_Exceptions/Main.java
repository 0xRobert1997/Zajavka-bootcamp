package Zajavka.days.day31_Exceptions;

public class Main {
    // NullPointerException
    // ArrayIndexOutOfBoundsException
    // Stacktrace -> zakładka na górze Code -> Analyze Stack Trace or Thread Dump

    // try {} catch (nazwa exception) {}

    // wszystkie wyjątki które dziedziczą z exception(lub ich klasy bazowe) są wyjątkami checked
    // wyjątki checked są sprawdzane na etapie kompilacji

    // wyjątki które dziedziczą z RuntimeException albo wyjątki których rodzice dziedziczą z Runtime
    // nie są sprawdzane na etapie kompilacji

    // jak jest unhandled expection to albo musi być throws albo try-catch

    public static void main(String[] args) throws MyException {
    try {
        printSomething1("Throw");
    } catch (Exception e) {
        System.out.println("xd");
    }
    }

    private static void printSomething1(final String input) throws MyException {
        printSomething2(input);
    }

    private static void printSomething2(final String input) throws MyException {
        printSomething3(input);

    }

    private static void printSomething3(final String input) throws MyException {
        printSomething4(input);
    }

    private static void printSomething4(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }
}
