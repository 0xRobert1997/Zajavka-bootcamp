package Zajavka.days.day22_Interface_polymorp.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Car[] arr = new Car[1000];

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabriolet(i % 4 == 0);

            } else {
                arr[i] = new SUV(1 + (double)i / 100);
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("iter: " + i);
            arr[i].describe();
        }

//        Car cabriolet2 = new Cabriolet(false);
//        Car suv2 = new SUV(1.92);
//
//        cabriolet2.describe();
//        suv2.describe();


    }
}
