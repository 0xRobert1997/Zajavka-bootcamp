package Zajavka.days.day33_ConstructorExceptions;

public class Person {
    private int age;

    public Person(int age) throws WrongAgeException {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new WrongAgeException("What is this dude?");
        }
    }

    public void someMethod() throws WrongAgeException {

    }
}
