package Zajavka.days.day34_InitblockExceptions_Finally;



public class ConstructorExamplesExceptions {

    public static void main(String[] args)   {
        try {
            Person person = new Person(50);
        } catch (WrongAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
