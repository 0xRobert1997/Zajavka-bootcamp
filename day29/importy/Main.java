package Zajavka.days.day29.importy;

import static Zajavka.days.day29.importy.Dog.NAME;
import static Zajavka.days.day29.importy.Dog.SURNAME;
import static Zajavka.days.day29.importy.Dog.AGE;

import static Zajavka.days.day29.importy.Dog.bark;
import static Zajavka.days.day29.importy.Dog.goForAWalkOnYourOwn;



public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(NAME);
        System.out.println(SURNAME);
        System.out.println(AGE);

        bark();
        goForAWalkOnYourOwn();


    }
}
