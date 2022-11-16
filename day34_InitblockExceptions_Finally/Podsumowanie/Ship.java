package Zajavka.days.day34_InitblockExceptions_Finally.Podsumowanie;

import java.io.IOException;

public class Ship {

    // każdy konstruktor musi mieć throws'a jeśli jest jakakolwiek szansa że z bloku będzie rzucony wyjątek
    private String name;


    public Ship(String name) {
        this.name = name;
    }
}
