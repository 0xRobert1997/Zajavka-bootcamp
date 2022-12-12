package Zajavka.zadania.cw14_lambda.zad3;

public class Main {

    public static void main(String[] args) {

        myInterface lambda1 = (int a, int b, String c) -> {
            return ("kekw " + a + " kekw " + b + " kekw " + c);
        };

        myInterface lambda2 = (a, b, c) -> ("kekw " + a + " kekw " + b + " kekw " + c);


        System.out.println(lambda1.functionInInterface(1, 2, "KEKM"));

    }
}
