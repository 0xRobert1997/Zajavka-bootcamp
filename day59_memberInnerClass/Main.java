package Zajavka.days.day59_memberInnerClass;



import java.math.BigDecimal;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // jak inner class nie jest static to trzeba utworzyc na instacji
        BlockOfFlats blockOfFlats = new BlockOfFlats();
        BlockOfFlats.Flat flat = blockOfFlats.new Flat(BigDecimal.TEN);

        // a jak jest statyczna to można na klasie
        // BlockOfFlats.Flat flat = new BlockOfFlats.Flat(BigDecimal.ONE);



        // effectively final
        String a = "zajavkA";
        // jeśli zmienimy a to później w lambdzie jest błąd kompilacji
        // a jesli damy final przy pierwszej inicjalizacji a to lambda przejdzie ale przy zmienia wartości a będzie błąd
        // a = "zajavka";
        Predicate<Integer> somePredicate = someInt -> a.length() > someInt;

        // lambda zakłada że można korzystać z parametrów z poza lambdy pod warunkiem że są final lub effectively final
    }
}
