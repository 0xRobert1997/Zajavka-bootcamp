package Zajavka.zadania.cw5_loops;

public class zad3 {
    public static void main(String[] args) {

        printTree(16);
    }

    private static void printTree(int floor) {

        int height = 0;


        if ((floor % 2) == 0) {
            height = floor / 2;
        } else {
            height = (floor / 2) + 1;
        }

        String spaceToPrint = " ";
        String signsToPrint = "#";

        if ((floor % 2) == 0) {
            signsToPrint += "#";
        }

        int numberOfSpaces = height;
        int numberOfSigns = 1;

        for (int i = 0; i < height; i++) {
            System.out.println(spaceToPrint.repeat(numberOfSpaces) + signsToPrint.repeat(numberOfSigns));
            numberOfSpaces--;
            if ((floor % 2) == 0) {
                numberOfSigns++;
            } else {
                numberOfSigns += 2;
            }
        }
    }
}

