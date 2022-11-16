package Zajavka.days.day45_Lambda;

public class Animal implements Jumpable{

    @Override
    public boolean canJump(String s, boolean b) {
        return s.contains("jump");
    }
}
