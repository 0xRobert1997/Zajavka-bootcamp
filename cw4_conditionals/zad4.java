package Zajavka.zadania.cw4_conditionals;

public class zad4 {
    public static void main(String[] args) {
        int monthNumber = 6;

        if ((monthNumber == 1)
                || (monthNumber == 3)
                || (monthNumber == 5)
                || (monthNumber == 7)
                || (monthNumber == 8)
                || (monthNumber == 10)
                || (monthNumber == 12)) {
            System.out.println("Ten miesiac ma 31 dni");
        } else if (monthNumber == 2) {
            System.out.println("Ten miesiac ma 28 dni");
        } else if (monthNumber < 12) {
            System.out.println("Ten miesiac ma 30 dni");
        } else {
            System.out.println("Nie ma takiego miesiaca xd");
        }


    }
}
