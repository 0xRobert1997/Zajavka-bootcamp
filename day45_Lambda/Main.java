package Zajavka.days.day45_Lambda;

public class Main {

    public static void main(String[] args) {

        Jumpable jumpable = new Animal();


        Jumpable jumpableLambda = (initParam, initParam2) -> {
            if (initParam2) {
                System.out.println("initParam2 is true");
            }
            return initParam.contains("jump");
        };

        System.out.println("lambda" + jumpableLambda.canJump("jumper", true));


    }
}
