package Zajavka.zadania.cw10_statics.cw4_asciTable;

import java.util.Arrays;

public class AsciTable {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(signsCreator(33, 50, 60)));

    }


    public static char[] signsCreator(int... args) {

        int tableSize = args.length;
        char[] asci = new char[tableSize];
        int[] argsTable = new int[tableSize];

        int i = 0;
        for (int arg : args) {
            argsTable[i] = arg;
            i++;
        }

        int j = 0;
        for (int k : argsTable) {
            asci[j] = getAsci(k);
            j++;
        }

        return asci;
    }



    public static char getAsci(int arg) {
        char asci;

        switch (arg) {
            case 32:
                asci = ' ';
                break;
            case 33:
                asci = '!';
                break;
            case 34:
                asci = '"';
                break;
            case 35:
                asci =  '#';
                break;
            case 36:
                asci =  '$';
                break;
            case 37:
                asci =  '%';
                break;
            case 38:
                asci =  '&';
                break;
            case 39:
                asci =  '`';
                break;
            case 40:
                asci =  '(';
                break;
            case 41:
                asci =  ')';
                break;
            case 42:
                asci =  '*';
                break;
            case 43:
                asci =  '+';
                break;
            case 44:
                asci =  '`';
                break;
            case 45:
                asci =  '-';
                break;
            case 46:
                asci =  '.';
                break;
            case 47:
                asci =  '/';
                break;
            case 48:
                asci =  '0';
                break;
            case 49:
                asci =  '1';
                break;
            case 50:
                asci =  '2';
                break;
            case 51:
                asci =  '3';
                break;
            case 52:
                asci =  '4';
                break;
            case 53:
                asci =  '5';
                break;
            case 54:
                asci =  '6';
                break;
            case 55:
                asci =  '7';
                break;
            case 56:
                asci =  '8';
                break;
            case 57:
                asci =  '9';
                break;
            case 58:
                asci =  ':';
                break;
            case 59:
                asci =  ';';
                break;
            case 60:
                asci =  '<';
                break;
            case 61:
                asci =  '=';
                break;
            case 62:
                asci =  '>';
                break;
            case 63:
                asci =  '?';
                break;
            default:
                asci = ' ';
        } return asci;
    }
}
