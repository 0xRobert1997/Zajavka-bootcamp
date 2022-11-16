package Zajavka.days.day30;

public class B extends A {

    static  String staticFieldClassB;
    static  String staticField2ClassB = initStaticField2ClassB();

    private String nonStaticField1ClassB;

    private String nonStaticField2ClassB;

    private String nonStaticField3ClassB = initField3ClassB();

    static {
        System.out.println("staticFieldClassB");
        staticFieldClassB = "staticFieldClassB";
//   kontekst statyczny jest ładowany wcześniej dlatego nie można stak zrobić
//   nonStaticField2ClassB = "nonStaticField2ClassB";
    }

    static {
        System.out.println("staticFieldClassB");
        staticFieldClassB = "staticFieldClassB";
//   kontekst statyczny jest ładowany wcześniej dlatego nie można stak zrobić
//   nonStaticField2ClassB = "nonStaticField2ClassB";
        // statycznych bloków może być kilka
    }



    {
        System.out.println("nonStaticField2ClassB");
        nonStaticField2ClassB = "nonStaticField2ClassB";
    }

    public B(String nonStaticField1ClassA, String nonStaticField1ClassB) {
        super(nonStaticField1ClassA);
        System.out.println("this.nonStaticField1ClassB = nonStaticField1ClassB;");
        this.nonStaticField1ClassB = nonStaticField1ClassB;
    }

    private String initField3ClassB() {
        System.out.println("initField3ClassB");
        return"initField3ClassB";
    }

    private static String initStaticField2ClassB() {
        System.out.println("initStaticField2ClassB");
        return "initStaticField2ClassB";
    }
}
