package Zajavka.days.day18_Heritage_Boxing_parsing.Heritage;

public class House extends Building{
    public int noOfRooms;
    public String name;
    public boolean hasWindows = true;

    @Override
    public String toString() {
        return "House{" +
                "noOfRooms=" + noOfRooms +
                ", name='" + name + '\'' +
                ", hasWindows=" + hasWindows +
                ", adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
