package Zajavka.days.day22_Interface_polymorp.Interface;

public class Cat implements CatStrokable, Voiceable{

    @Override
    public void doSomethingAsStrokableCat() {
        System.out.println("I like being stroked!");
    }

    @Override
    public void beStroked() {
        System.out.println("I am stroked and its really nice man!");
    }

    @Override
    public String gimmeVoice(String songName) {
        return "I'm giving you my voice";
    }

    @Override
    public void sing(String songName) {
        System.out.println("I'n singing song " + songName);
    }
}
