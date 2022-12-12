package Zajavka.zadania.cw7_object.Calc;

public class QuarterCalculator extends FunctionClass {
    int k = 0;
    @Override
    public int calculate(int i) {
        k = i / 4;
        return k;
    }
}
