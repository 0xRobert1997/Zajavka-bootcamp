package Zajavka.days.day31_Exceptions.Podsumowanie;

public class Car extends Vehicle {

    @Override
    public void drive() throws NullPointerException{
        System.out.println("Driving");
    }
}
