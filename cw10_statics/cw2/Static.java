package Zajavka.zadania.cw10_statics.cw2;

public class Static {

    public static int counter = 0;

    public static String name = "Pepegacz";

    public Static() {
        counter++;
        System.out.println("numbers of instances in Static class: " + counter);
        System.out.println("Name of creating instance: " + name);
    }


}
