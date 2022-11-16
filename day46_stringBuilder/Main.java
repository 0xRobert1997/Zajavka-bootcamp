package Zajavka.days.day46_stringBuilder;

public class Main {

    public static void main(String[] args) {
                                            // V jak poda się int to będzie początkowe capacity
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World!");
        System.out.println(sb);

        // na trzecim indeksie wstawia tekst
        sb.insert(2, "XD");
        System.out.println(sb);

        sb.replace(1, 3, "KEKW");
        System.out.println(sb);

        sb.delete(1, 5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        // cap jest defaulotowo 16 a jak przekroczy to robi się x2 + 2
        StringBuilder sd = new StringBuilder();
        System.out.println(sd.capacity());
        sd.append("World");
        System.out.println(sd.capacity());
        sd.append("World! java tutorial");
        System.out.println(sd.capacity());
        sd.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(sd.capacity());

        // można potem zmienić na stringa jeśli jest taka potrzeba
        sd.toString();



    }
}
