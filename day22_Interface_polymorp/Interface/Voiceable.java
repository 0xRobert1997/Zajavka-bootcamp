package Zajavka.days.day22_Interface_polymorp.Interface;

public interface Voiceable {

    default String gimmeVoice(String songName) {
        return "i sing " + songName;
    }

    default void sing(String songName) {
        System.out.println("default singing song method" + songName);
    }


}
