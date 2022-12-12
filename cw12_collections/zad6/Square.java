package Zajavka.zadania.cw12_collections.zad6;

public class Square {
    //Napisz klasę Square reprezentującej kwadrat. Dodaj konstruktor w którym użytkownik może
    //określić tę wartość. Do tego dodaj getter oraz setter. Pamiętaj o enkapsulacji. Dodaj metodę liczącą
    //obwód i metodę liczącą pole kwadratu. Nadpisz metodę equals(). Nadpisz metodę toString(). Użyj
    //następnie tej klasy, aby stworzyć kilka kwadratów o różnych bokach i umieścić je w liście. Dodaj
    //kilka zduplikowanych kwadratów. Następnie zaproponuj strukturę, która pozwoli usunąć duplikaty
    //z kolekcji elementów.

    private int side;

    public int calcField (){
        int field = side * side;
        return field;
    }

    public int calcCircuit() {
        int circuit = side * 4;
        return circuit;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return getSide() == square.getSide();
    }

    @Override
    public int hashCode() {
        return getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
