package Zajavka.days.day25;

public class Main {

    public static void main(String[] args) {
        Bag bag = new Bag(3);
        Kangaroo kangaroo = new Kangaroo(bag,"Kinga", 10);
        System.out.println(kangaroo);
        kangaroo = kangaroo.withAge(3).withName("Daria").withName("Grazyna");
        System.out.println(kangaroo);


    }
}
