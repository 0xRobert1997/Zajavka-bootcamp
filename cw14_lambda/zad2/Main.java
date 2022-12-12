package Zajavka.zadania.cw14_lambda.zad2;

public class Main {

    public static void main(String[] args) {

        myInterface lambda1 = (int initParam, String initParam2) -> initParam2 + initParam;

        myInterface lambda2 = (initParam, initParam2) -> {
            return (initParam2 + initParam);
        };

        myInterface lambda3 = (int initParam, String initParam2) -> {
            return (initParam2 + initParam);
        };



        System.out.println(lambda1.functionInInterface(5, "kekw"));
        System.out.println(lambda2.functionInInterface(8, "kuku"));

    }
}
