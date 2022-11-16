package Zajavka.days.day20_Initblock_Overridin.initBlocks;

public class Car {
    {
        this.productionYear = "2020";
        printDuringInitBlock();
    }

    private String productionYear;

    public Car(String productionYear) {
        System.out.println(Car.class + " Constructor called");
        this.productionYear = productionYear;
    }

    private void printDuringInitBlock () {
        System.out.println("I'm printing during init block" + Cabriolet.class);
    }


}
