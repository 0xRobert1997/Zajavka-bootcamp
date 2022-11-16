package Zajavka.days.day34_InitblockExceptions_Finally;


public class Person {

    private int age;

    {
        this.age = 12;
        if (age == 12) {
            try {
                throw new WrongAgeException("block what is this dude?");
            } catch (WrongAgeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Valid age in init block");
        }
        System.out.println("Init block end");
    }

    public Person(int age) throws WrongAgeException {
        System.out.println("Person constructor begining");
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("Person constructor being fine!");
        } else {
            System.out.println("Person constructor throwing exception");
            throw new WrongAgeException("What is this dude?");
        }
        System.out.println("Person constructor ending");
    }
}
