package Zajavka.zadania.cw10_statics.cw5_withInterface;

public interface IParent {



    default String getName() {
        return "Parent name";
    }


    static String getClassName() {
        return "Parent";
    }


}
