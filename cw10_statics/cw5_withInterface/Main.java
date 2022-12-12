package Zajavka.zadania.cw10_statics.cw5_withInterface;

public class Main {

    public static void main(String[] args) {

        IParent child1 = new AnotherChild();
        AnotherChild child2 = new AnotherChild();

        System.out.println(child1.getName());

        // nie da się wywołać metody statycznej na referencji typ interfejsu
    //    child1.getClassName();

        System.out.println(child2.getName());
        System.out.println(child2.getClassName());


    }
}
