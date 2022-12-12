package Zajavka.zadania.cw10_statics.cw3_withAbstClass;

public class Main {

    public static void main(String[] args) {

        AParent child1 = new Child("Tomek");
        Child child2 = new Child("Franek");


        System.out.println(child1.getName());
        System.out.println(child1.getClassName());

        System.out.println(child2.getName());
        System.out.println(child2.getClassName());
    }
}
