package Zajavka.days.day15_Sort_VarArgs;

// var argsy - gdy nie wiemy ile arguemtnow będzie trzeba podać do metody

public class VarArgs {
    public static void main(String... args) {
        printUniversalMultiplicationResult(1, 2, 3, 4);
        printUniversalMultiplicationResult(1, 2, 3, 4, 5);
    }

    // var argsy są traktowane jak tablice
    // var argsy muszą być ostatnim podanym parametrem przy formułowaniu metody V
    private static void printUniversalMultiplicationResult(int... args) {
        int result = 1;
        for (int arg : args) {
            result *= arg;
        }
        System.out.println(result);
    }
}
