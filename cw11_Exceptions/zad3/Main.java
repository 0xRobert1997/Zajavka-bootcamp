package Zajavka.zadania.cw11_Exceptions.zad3;

public class Main {

    public static void main(String[] args) {

    }

    private static void exampleMethod() {

        try {
            throwingMethod();
        } catch (MyExtendingException e){
            System.out.println("3rd");
        } catch (MyCheckedException e) {
            System.out.println("2nd");
        } catch (Exception e) {
            System.out.println("1st");
        }
    }


    private static void throwingMethod() throws Exception {

    }

}
