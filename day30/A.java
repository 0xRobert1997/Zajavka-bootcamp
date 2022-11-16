package Zajavka.days.day30;

public class A {

    static String staticFieldClassA;

    private String nonStaticFieldClassA;

    private String nonStaticField2ClassA;

    private String nonStaticField3ClassA = initField3ClassA();

    {
        nonStaticField2ClassA = "nonStaticField2ClassA";
    }

    public A(String nonStaticFieldClassA) {
        this.nonStaticFieldClassA = nonStaticFieldClassA;
    }

    private String initField3ClassA() {
        System.out.println("initField3ClassA");
        return "initField3ClassA";
    }
}
