package Zajavka.zadania.cw9_enums.Week;

import Zajavka.zadania.cw9_enums.Week.Day;

public class ex1 {

    public static void main(String[] args) {

        String variable = "MONDAY";

        //System.out.println(Arrays.toString(Day.values()));

        Day toCheck  = Day.valueOf(variable);


        for (Day value : Day.values()) {
            System.out.println(
                    value + " Is working day? "+ value.isWorkingDay(value) + " Is weekend? " + value.isWeekend(value) );


        }

        System.out.println(toCheck);





    }
}
