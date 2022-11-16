package Zajavka.days.day28_Statics;

public class Dog extends Animal {
    //static sprawia że pole jest przypisywane do klasy a nie do obiektu

    public static int howManyDogDoWeHaveInOurProgram;

    public String name;

    public Dog(String name) {
        this.name = name;
        howManyDogDoWeHaveInOurProgram++;
    }
}
