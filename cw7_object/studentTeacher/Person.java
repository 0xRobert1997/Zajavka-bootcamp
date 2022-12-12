package Zajavka.zadania.cw7_object.studentTeacher;

public abstract class Person {

    private final String name;

    private final String surname;

    public Person(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
