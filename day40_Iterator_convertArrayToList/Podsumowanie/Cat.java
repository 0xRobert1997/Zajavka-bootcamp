package Zajavka.days.day40_Iterator_convertArrayToList.Podsumowanie;

import java.util.ArrayList;
import java.util.List;

public final class Cat {

    // final w tym przypadku mówi że jak raz przypiszemy kolekcje do tego pola to nie możemy przypisać potem nowej
    // ale nie mówi że zawartość tej przypisanej kolekcji nie może się zmienić
    private final List<String> friendsNames;

    public Cat(List<String> friendsNames) {
        this.friendsNames = new ArrayList<>(friendsNames);
        // trzeba tutaj zrobić nową liste
    }

    public List<String> getFriendsNames() {
        return new ArrayList<>(friendsNames);
        // tutaj też trzeba zrobić nową listę
    }

    @Override
    public String toString() {
        return "Cat{" +
                "friendsNames=" + friendsNames +
                '}';
    }
}
