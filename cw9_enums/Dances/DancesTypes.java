package Zajavka.zadania.cw9_enums.Dances;

import java.util.Arrays;

public enum DancesTypes {

    CHACHA(new String[]{"Monday", "Thursday"}, new String[]{"10:00", "14:00"}, "PASODOBLE"),
    RUMBA(new String[]{"Tuesday", "Friday"}, new String[]{"12:00", "14:00"}, "TANGO"),
    SAMBA(new String[]{"Wednesday", "Saturday"}, new String[]{"10:00", "14:00"}, "CHACHA"),
    PASODOBLE(new String[]{"Monday", "Friday"}, new String[]{"10:00", "12:00"}, "SAMBA"),
    TANGO(new String[]{"Tuesday", "Saturday"}, new String[]{"12:00", "14:00"}, "RUMBA");

    public String[] daysTable;
    public String[] timeTable;

    public String alternative;


    DancesTypes(
            String[] daysTable,
            String[] timeTable,
            String alternative
    ) {
        this.daysTable = daysTable;
        this.timeTable = timeTable;
        this.alternative = alternative;
    }


}
