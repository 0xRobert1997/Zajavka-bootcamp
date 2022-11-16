package Zajavka.days.day21_Get_Set_Abstract.klasyAbstrakcyjne;

public abstract class Animal {

    private String color;

    public Animal(final String color) { this.color = color;}

    // metoda abstrakcyjna nie może miec ciała, dlatego nie ma {}
    abstract String gimmeVoice();

    // ale w abstrakcyjnej klasie można robić też normalne metody
    public void methodExample() {
        System.out.println("xd");
    }

}
