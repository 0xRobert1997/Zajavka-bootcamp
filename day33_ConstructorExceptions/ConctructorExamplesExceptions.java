package Zajavka.days.day33_ConstructorExceptions;

public class ConctructorExamplesExceptions {


    public static void main(String[] args) {
        try {
            Person person = new Person(10);
        } catch (WrongAgeException e) {
            System.out.println("ooops!");
        }
    }
}
