package Zajavka.days.day27_debugging;

public class Main {

    // debugger zatrzymuje się przed wywołaniem zaznaczonej linijki a nie po

    public static void main(String[] args) {

        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildHouse(5.0, "Zajavkowa 7/5, Tarnowo Podgorne");

        System.out.println(house.getArea());
        System.out.println(house.getAddress());




    }
}
