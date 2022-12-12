package Zajavka.zadania.cw10_statics.cw3_withAbstClass;

public class Child extends AParent{

    public Child(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public static String getClassName() {
        return getStaticName();
    }
}
