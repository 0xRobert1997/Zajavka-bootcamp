package Zajavka.days.day22_Interface_polymorp.Podsumowanie;


public class Ostrich implements Animal, Swimmable {
    public Ostrich() {
        super();
    }

    @Override
    public void run() {
        System.out.println("I'm running");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
