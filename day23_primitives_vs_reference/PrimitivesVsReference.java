package Zajavka.days.day23_primitives_vs_reference;

public class PrimitivesVsReference {
    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println(cat);
        passByReferenceOrPassByValue(cat);
        System.out.println(cat);


        int i = 10;
        System.out.println(i);
        passByReferenceOrPassByValue(i);
        System.out.println(i);

    }

    private static void passByReferenceOrPassByValue(Cat coś) {
        Cat cat = new Cat("Kazik");
        }
    private static void passByReferenceOrPassByValue(int i) {
        i = 20;
    }
}
