package Zajavka.zadania.cw7_object.Calc;

public class HalfCalculator extends FunctionClass{
    int j = 0;

    @Override
    public int calculate(int i) {
        j = i / 2;
        return j;
    }
}
