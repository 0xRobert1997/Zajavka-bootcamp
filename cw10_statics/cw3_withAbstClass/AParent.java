package Zajavka.zadania.cw10_statics.cw3_withAbstClass;

public abstract class AParent {

    private String name;

    private static String staticName = "Kasia";

    public AParent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getClassName() {
        return staticName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getStaticName() {
        return staticName;
    }
}
