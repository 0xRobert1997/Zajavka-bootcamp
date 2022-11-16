package Zajavka.days.day22_Interface_polymorp.Polymorphism;

public class Cabriolet implements Car{

    private boolean roofOpened;

    public Cabriolet(boolean roofOpened) {

        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public void setRoofOpened(boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    @Override
    public void describe() {
        System.out.println("Cabriolet description start");

        System.out.println("Cabriolet has opened roof: " + roofOpened);
        System.out.println("Cabriolet description end");
    }
    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                '}';
    }
}
