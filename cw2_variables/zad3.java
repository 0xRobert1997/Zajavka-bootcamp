package Zajavka.zadania.cw2_variables;

public class zad3 {

    public static void main(String[] args) {
        String a = "a";
        var a2 = "ą";
        var e = "e";
        var e2 = "ę";
        var o = "o";
        var ó = "ó";
        var u = "u";
        var y = "y";

        String sentence = "bum trala la la la, co slychac z dala?";
        String replacement = " 4,4 ";

        String new_sentence = sentence.replaceAll(a, replacement);
        new_sentence = new_sentence.replaceAll(a2, replacement);
        new_sentence = new_sentence.replaceAll(e, replacement);
        new_sentence = new_sentence.replaceAll(e2, replacement);
        new_sentence = new_sentence.replaceAll(o, replacement);
        new_sentence = new_sentence.replaceAll(ó, replacement);
        new_sentence = new_sentence.replaceAll(u, replacement);
        new_sentence = new_sentence.replaceAll(y, replacement);

        System.out.println(sentence);
        System.out.println(new_sentence);



    }
}
