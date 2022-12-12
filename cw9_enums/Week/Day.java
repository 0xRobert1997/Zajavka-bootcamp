package Zajavka.zadania.cw9_enums.Week;

public enum Day implements WorkingDay, Weekend {

    MONDAY ("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THUR"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private String shortcut;

    Day(String shortcut) {
        this.shortcut = shortcut;
    }

    @Override
    public boolean isWorkingDay(Day day) {
        if (day == Day.SATURDAY) {
            return false;
        } else if (day == Day.SUNDAY){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isWeekend(Day day) {
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "(" +
                shortcut +
                ')';
    }


}
