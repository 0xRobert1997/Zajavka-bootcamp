package Zajavka.days.day40_Iterator_convertArrayToList;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableVsCollection {

    private final Set<String> someSet;

    public ImmutableVsCollection(String someElement1, String someElement2) {
        Set<String> objects = new HashSet<>();
        objects.add(someElement1);
        objects.add(someElement2);
        this.someSet = objects;
    }

    public final Set<String> getSomeSet() {
        // 1 wersja: return someSet;
        // rozwiązanie problemu immutable:
        return new HashSet<>(someSet);
        // zawsze jak będziemy brali set przed getSomeSet będzie zwracana jego kopia
        // więc jeśli mamy jakąkolwiek kolekcje
    }

    public static void main(String[] args) {
        ImmutableVsCollection obj = new ImmutableVsCollection("element1", "element2");
        Set<String> someSet = obj.getSomeSet();
        System.out.println(someSet);
        someSet.add("element3");
        System.out.println(someSet);
    }
}
