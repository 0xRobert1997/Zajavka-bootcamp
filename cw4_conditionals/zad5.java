package Zajavka.zadania.cw4_conditionals;

public class zad5 {
    public static void main(String[] args) {
        int month = 12;
        int days = 0;

        switch (month) {
            case 1:
                days += 31;
                break;
            case 2:
                days += 31 + 28;
                break;
            case 3:
                days += 31 + 28 + 31;
                break;
            case 4:
                days += 31 + 28 + 31 + 30;
                break;
            case 5:
                days += 31 + 28 + 31 + 30 + 31;
                break;
            case 6:
                days += 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 7:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 8:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 9:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 10:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 11:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            case 12:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                break;
            default:

        }
        System.out.println("Od poczatku roku do konca tego miesiaca minie " + days + " dni");
    }
}
