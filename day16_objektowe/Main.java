package Zajavka.days.day16_objektowe;

public class Main {
    public static void main(String[] args) {

        Tuna tuna = new Tuna();
        Tuna tuna2 = new Tuna();
        Tuna tuna3 = new Tuna();

        tuna2.name = "Tunkowa";
        tuna.swim();
        tuna2.swim();
        tuna3.swim();

//        System.out.println(tuna.name);
//        System.out.println(tuna2.name);
//        System.out.println(tuna3.name);


    }
}
