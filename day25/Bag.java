package Zajavka.days.day25;

public class Bag {
    private int size;

    public Bag(int size) {
        this.size = size;
    }

    public Bag(Bag bag) {
        this.size = bag.size;
    }
}
