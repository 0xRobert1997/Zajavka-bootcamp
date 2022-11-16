package Zajavka.days.day22_Interface_polymorp.Polymorphism;

public class SUV implements Car{

    private double height;

    public SUV(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void describe() {
        System.out.println("SUV description start");
        System.out.println("SUV height: " + height);
        System.out.println("SUV description end");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "height=" + height +
                '}';
    }
}
