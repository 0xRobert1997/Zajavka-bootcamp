package Zajavka.zadania.cw15_javaAPI;

import static java.lang.Character.toUpperCase;

public class zad2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jajo jako tako");
        firstCaseUp(sb);

    }

    public static void firstCaseUp(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if(i == 0 ) {
                Character x = sb.charAt(i);
                x = toUpperCase(x);
                sb.setCharAt(i, x);
            } else if (i > 0 && sb.charAt(i - 1) == ' ') {
                Character x = sb.charAt(i);
                x = toUpperCase(x);
                sb.setCharAt(i, x);
            }
        }
        System.out.println(sb);
    }

}
