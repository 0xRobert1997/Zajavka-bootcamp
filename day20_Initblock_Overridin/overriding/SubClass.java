package Zajavka.days.day20_Initblock_Overridin.overriding;

public class SubClass extends SuperClass{


    // Nie można overridować
    private String privateMethod() {
        return "SubClass privateMethod";
    }

    @Override
    String defaultMethod() {
        return "SubClass defaultMethod";
    }

    @Override
    protected String protectedMethod() {
        return "SubClass protectedMethod";
    }

    @Override
    public String publicMethod() {
        return "SubClass publicmethod";
    }
}
