package Zajavka.days.day33_ConstructorExceptions.Podsumowanie;


public abstract class Animal {

    private String name;

    public Animal(String name)  {
        if (name == null) {
            throw new InvalidAnimalNameException("Provided name is null");
        }
            this.name = name;
    }
}
