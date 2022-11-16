package Zajavka.days.day31_Exceptions.Podsumowanie;

public class Driver {

    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if (age < 18) {
            throw new DriverTooYoungException("You cannot drive below 18yo. Provided " + age + "years.");
        }
        if (age < 26) {
            throw new DriverTooLittleExperienceException("You have to little driving experience. Provided " + age + "years.");
        }
        System.out.println("setting drivers age to " + age);
        this.age = age;
    }
}
