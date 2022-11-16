package Zajavka.days.day48_Optional.Podsumowanie;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Human> human = retrieveHuman("Adama");
        //human.ifPresentOrElse(h -> System.out.println(h.getName()), () -> System.out.println("Nothing inside"));
        // jeśli wywołamy geta na optionalEmpty to wyskoczy NoSuchElementException
        // to jest get - wypakowanie optionala a nie getName, nie ma toString'a więc po wydrukowaniu da krzaki
        // human.get();


        // można użyć V zamiast if'ów
        // orElse nie przyjmuje lambdy tylko zwykłą metodę
        // nadiaMethod odpali się niezależnie od tego czy human jest empty czy nie
        System.out.println(human.orElse(nadiaMethod()));
        // dlatego lepiej użyć orElseGet żeby w przypadku pustego pudełka nie wywoływać kodu

        // orElseGet przyjmuje supplier'a
        System.out.println(human.orElseGet(() -> {
            System.out.println("To jest z orElseGet");
             return new Human("Nadiaaa");
        }));
    }

    private static Human nadiaMethod() {
            System.out.println("To jest z orElse");
            return new Human("Nadiaaa");
    }

    public static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
