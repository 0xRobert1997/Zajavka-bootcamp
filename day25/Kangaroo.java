package Zajavka.days.day25;

public final class Kangaroo {
    private final Bag bag;
    private final String name;
    private final int age;


    public Kangaroo(Bag bag, String name, int age) {
        this.bag = new Bag(bag);
        this.name = name;
        this.age = age;
    }

    public Kangaroo withName(String name) {
        return new Kangaroo(this.bag, name, this.age);
    }

    public Kangaroo withAge(int age) {
        return new Kangaroo(this.bag, this.name, age);
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
