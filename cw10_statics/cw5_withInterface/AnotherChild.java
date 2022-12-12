package Zajavka.zadania.cw10_statics.cw5_withInterface;

public class AnotherChild implements IParent{


    @Override
    public String getName() {
        return "Child name";
    }

    static String getClassName() {
        return "Child";
    }
}
