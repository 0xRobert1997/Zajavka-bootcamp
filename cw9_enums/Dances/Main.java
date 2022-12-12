package Zajavka.zadania.cw9_enums.Dances;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DancesTypes dance = DancesTypes.RUMBA;
        DancesTypes dance2 = DancesTypes.TANGO;

        System.out.println(dance + " possible hours: " + Arrays.toString(dance.timeTable) + " Days: " + Arrays.toString(dance.daysTable) + " Alternative: " + dance.alternative);
        System.out.println(dance2 + " possible hours: " + Arrays.toString(dance2.timeTable) + " Days: " + Arrays.toString(dance2.daysTable) + " Alternative: " + dance2.alternative);


    }
}
