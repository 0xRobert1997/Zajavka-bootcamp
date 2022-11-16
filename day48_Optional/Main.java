package Zajavka.days.day48_Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> ofFull = Optional.of("Hello");
        // jesli w środku będzie null to zwróci empty zamiast tego nulla
        Optional<String> ofNullableNull = Optional.ofNullable(null);

        /*if (ofFull.isPresent()) {
            String variable = ofFull.get();
            System.out.println(variable);
        }*/

        // przy empty.get() wywali wyjątek a orElse w razie gdy nic nie ma w środku da podaną wartość
       /* String variable = empty.orElse("Default");
        System.out.println(variable);*/

        String variabl1 = ofFull.orElse(deafult1());
        String variabl2 = ofFull.orElseGet(() -> deafult2());
        // użycie lambdy dla odroczonej egzekucji


        // empty.orElseThrow(() -> new RuntimeException("Empty value"));


        empty.ifPresentOrElse(element -> System.out.println(element), () -> System.out.println("default"));




    }

    private static String deafult1() {
        System.out.println("default1");
        return "default1";
    }
    private static String deafult2() {
        System.out.println("default2");
        return "default2";
    }




}
