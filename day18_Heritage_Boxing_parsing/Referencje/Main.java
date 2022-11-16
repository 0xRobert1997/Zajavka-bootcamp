package Zajavka.days.day18_Heritage_Boxing_parsing.Referencje;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Flat flat = new Flat();

        System.out.println(building);

        byte b = 1;
        Byte bC = b; //autoboxing
        byte bb = bC; // unboxing

        // Parsowanie
        Integer iC2 = Integer.parseInt("123");
        System.out.println(iC2);

        System.out.println(flat);
        flat.name = "kazik";
        System.out.println(flat.name);
        System.out.println(flat);

    }
}
