package Zajavka.days.day18_Heritage_Boxing_parsing;

public class boxing_parsing {
    public static void main(String[] args) {

        byte b = 1;
        Byte bC = b; //autoboxing
        byte bb = bC; // unboxing

        // Parsowanie
        Integer iC2 = Integer.parseInt("123");
        System.out.println(iC2);

        Integer iC3 = (int)Double.parseDouble("123.1");
        System.out.println(iC3);
        // na klasach można wywoływać metody a na prymitywach nie
        Double iC4 = Double.parseDouble("123.1");
        System.out.println(iC4);
    }
}
