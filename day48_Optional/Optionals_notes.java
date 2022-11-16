package Zajavka.days.day48_Optional;

import java.util.Optional;

public class Optionals_notes {

    public static void main(String[] args) {

        // tworzenie
        Optional<String> variable1 = Optional.of("Hiho");
        Optional<String> variable2 = Optional.empty();

        // sprawdzenie zawartości - zwraca boolean
        variable1.isPresent();
        variable1.isEmpty();

        // pobranie zawartości, jeśli pobierzemy z pustego optionala wyskoczy exception
        String myString = variable1.get();

        // ifPresent przyjmuje Consumer'a (coś dostaje a sam nic nie zwraca)
        variable1.ifPresent(a -> System.out.println("there is: " + a));

        // wartość domyślna
        // orElse przypisuje do zmiennej zawartość albo jeśli optional jest pusty to to co podamy
        // ale jeśli w środku ma metodę to ta metoda zawsze się odpala a przy orElseGet odpali się tylko wtedy
        // gdy optional jest pusty
        String unpacked = variable1.orElse("wartość jesli optional jest pusty");
        System.out.println(unpacked);

    }


}
