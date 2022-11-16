package Zajavka.days.day60_anonymous_staticNested;

public class AnonymousMain {

    public static void main(String[] args) {
        AnonymousMain main = new AnonymousMain();
        System.out.println(main.callInnerInterface());
        System.out.println(main.callInnerAbstractClass());
        System.out.println();
    }

    private String callInnerAbstractClass() {
        Animal animal = new Animal() {
            @Override
            String whatsYourName() {
                return "my name is Abstract class";
            }
        };
        return animal.whatsYourName();
    }

    private String callInnerInterface() {
        Singable singable = new Singable() {
            @Override
            public String singASong(String songName) {
                return "I'm singing a song with name: " + songName;
            }
        };
        return singable.singASong("my beautiful song!");
    }

    // można zastąpić lambdą
/*    private String callInnerInterface() {
        Singable singable = songName -> "I'm singing a song with name: " + songName;
        return singable.singASong("my beautiful song!");
    }*/

    interface Voiceable {
        String silentVoice();

        String loudVoice();
    }

    interface Singable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}
