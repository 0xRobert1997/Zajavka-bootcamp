package Zajavka.days.day18_Heritage_Boxing_parsing.Heritage;

public class Building {

    public String adress = "St. Paul II";
    public int number = 12;

    public void print() {
        System.out.println("I'm buiding");
    }

    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
