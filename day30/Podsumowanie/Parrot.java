package Zajavka.days.day30.Podsumowanie;

public class Parrot {

    private static String name;

    private String surname;

    static {
        name = "Statyczna Agata";
    }

    {
        name = "Niestatyczna Agata";
        surname = "I Hakuna Matata";
    }

    public String getName() {
        return name;
    }
}
