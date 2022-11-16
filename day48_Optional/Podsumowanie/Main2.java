package Zajavka.days.day48_Optional.Podsumowanie;

import java.util.Locale;
import java.util.Optional;

public class Main2 {

    public static void main(String[] args) {
        Optional<Human> human = retrieveHuman("Adama");

        // jeśli human będzie pusty to rzuci wyjątek
        // System.out.println(human.orElseThrow(() -> new RuntimeException("No human in the box")));

        Optional<String> name = human.map(h -> h.getName());
        System.out.println(name.map(n -> n.toUpperCase()));


        human.map(h -> h.getName()).filter(n -> n.length() > 4).ifPresent(n -> System.out.println(n));
    }

    public static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
