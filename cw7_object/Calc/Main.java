package Zajavka.zadania.cw7_object.Calc;

public class Main {
    public static void main(String[] args) {

        FunctionClass HalfCalculator = new HalfCalculator();
        FunctionClass QuarterCalculator = new QuarterCalculator();

        System.out.println(HalfCalculator.calculate(100));
        System.out.println(QuarterCalculator.calculate(100));

        FunctionClass[] functionTable = new FunctionClass[10];

        for (int i = 0; i < functionTable.length; i++) {
            if (i % 2 == 0) {
                functionTable[i] = new HalfCalculator();
            } else {
                functionTable[i] = new QuarterCalculator();
            }
        }

        int finalScore = 0;
        int score = 12642364;

        for (FunctionClass functionClass : functionTable) {
            score = functionClass.calculate(score);
            finalScore = finalScore + functionClass.calculate(score);
        }

        System.out.println(score);
        System.out.println(finalScore);




    }
}
