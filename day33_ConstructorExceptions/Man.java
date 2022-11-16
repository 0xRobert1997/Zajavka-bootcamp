package Zajavka.days.day33_ConstructorExceptions;

public class Man extends Person{

    private String favouriteColor;

    public Man(int age) throws WrongAgeException {
        this(age, "yellow");
    }

    public Man(int age, String favouriteColor) throws WrongAgeException {
        super(age);
        this.favouriteColor = favouriteColor;
    }

    @Override
    public void someMethod()  {

    }
}
