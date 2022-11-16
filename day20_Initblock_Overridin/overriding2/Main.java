package Zajavka.days.day20_Initblock_Overridin.overriding2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Animal catnimal = new Cat();

        // tak już nie można -> Cat animalat = new Animal();

        animal.eat();
        cat.eat();
        catnimal.eat();

    }
}
