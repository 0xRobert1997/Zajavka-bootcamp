package Zajavka.days.day17.cucumber;

public class Person {

    public void eat(Cucumber cucumber) {
        System.out.println("eating cucumber");
    }
    public void eat(Milk milk) {
        System.out.println("drinkin milk");
    }
    public void eat(Cucumber... cucumbers) {
        System.out.println("eating bread");
    }
}
