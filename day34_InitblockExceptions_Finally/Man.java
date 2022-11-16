package Zajavka.days.day34_InitblockExceptions_Finally;


public class Man extends Person{

    private String favouriteColor;

    public Man(int age) throws Exception {
        this(age, "Yellow");
    }

    public Man(int age, String favouriteColor) throws WrongAgeException {
        super(age);
        this.favouriteColor = favouriteColor;
    }
}
