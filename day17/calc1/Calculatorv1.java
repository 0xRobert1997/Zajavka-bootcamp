package Zajavka.days.day17.calc1;

public class Calculatorv1 {
    public static void main(String[] args) {

        byte by = 1;
        short sh = 12;
        int in = 123;

        Calculatorv1 calc = new Calculatorv1();
        calc.show(by);
        calc.show(sh);
        calc.show(in);


    }
    public void show(byte b) {
        System.out.println("byte: " + b);
    }
    public void show(short s) {
        System.out.println("short: " + s);
    }
    public void show(int i) {
        System.out.println("int: " + i);
    }
}
