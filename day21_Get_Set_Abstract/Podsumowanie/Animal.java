package Zajavka.days.day21_Get_Set_Abstract.Podsumowanie;

public abstract class Animal {
    private String name;
    private String age;

    public Animal(String name) {
        this.name = name;
    }


    public abstract String getName();

    public String setAge(String age) {
        this.age = age;
        return age;
    }
}
