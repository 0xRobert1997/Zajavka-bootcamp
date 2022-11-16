package Zajavka.days.day38_Set;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdańsk");
        set1.add("Warszawa");
        set1.add("Szczecin");
        set1.add("Szczecin");
        set1.add("Wrocław");

        Set<String> set2 = new HashSet<>();
        set2.add("Łodź");
        set2.add("Warszawa");
        set2.add("Białystok");
        set2.add("Zakopane");
        set2.add("Szczecin");
        set2.add("Wrocław");

/*        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);*/

        // zachowuje wspólne wystąpienia
/*        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);*/

        // z set1 usuwamy wszystko co jest w set2
/*        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);*/

        System.out.println(set1.contains("Szczecin"));
        System.out.println(set1.contains("Gdynia"));




    }
}
