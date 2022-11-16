package Zajavka.days.day33_ConstructorExceptions;

public class Woman extends Person{

    public Woman(int age) throws WrongAgeException {
        super(age);
    }
}
