package Zajavka.zadania.cw15_javaAPI;

public class zad1 {
    // palindrom

    public static void main(String[] args) {

        System.out.println(isPalidrome("level"));
    }

    public static boolean isPalidrome(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder temp = sb;
        StringBuilder sd = temp.reverse();
        String d = sd.toString();


        if (s.equals(d)) {
            return true;
        } else {
            return false;
        }
    }
}
