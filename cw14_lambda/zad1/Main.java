package Zajavka.zadania.cw14_lambda.zad1;

public class Main {
    public static void main(String[] args) {

        myClass object1 = new myClass();


        myInterface myLambda = initParam -> ("FunctionOne " + initParam);

        myInterface myLambda2 = (int initParam) -> ("FunctionOne " + initParam);

        myInterface myLambda3 = (initParam) -> {
            return ("FunctionOne " + initParam);
        };
        myInterface myLambda4 = (int initParam) -> {
            return ("FunctionOne " + initParam);
        };

        // System.out.println(myLambda.functionOne(2));




    }

}
