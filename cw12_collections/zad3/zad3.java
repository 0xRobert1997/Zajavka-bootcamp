package Zajavka.zadania.cw12_collections.zad3;

import java.util.HashSet;
import java.util.Set;

public class zad3 {

    // Napisz program, który stworzy Set z elementami klasy Employee. Employee posiada imię i nazwisko.
    //Dodaj do Seta kilku pracowników, o tym samym imieniu i nazwisku bez nadpisywania metody
    //hashCode(), potem zrób to samo z nadpisaną metodą hashCode(). Jaka jest różnica?


    public static void main(String[] args) {

        Set<Employee> mySet = new HashSet<>();

        mySet.add(new Employee("Robert", "Kowalski"));
        mySet.add(new Employee("Robert", "Kowalski"));
        mySet.add(new Employee("Maciek", "Maciejski"));
        mySet.add(new Employee("Maciek", "Maciejski"));

        System.out.println(mySet);


    }
}
