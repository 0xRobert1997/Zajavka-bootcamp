package Zajavka.zadania.cw5_loops;

public class zad2 {
    public static void main(String[] args) {
        String word = "ala";
        String reversed = "";
        char ch;

        System.out.println("Orginal word: " + word);

        for (int i = 0; i <word.length(); i++) {
            ch = word.charAt(i);
            reversed = ch + reversed;
        }
        System.out.println(reversed);

        if (word.equals(reversed)) {
            System.out.println("This is palindrome word");
        }
    }
}
