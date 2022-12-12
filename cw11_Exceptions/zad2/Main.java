package Zajavka.zadania.cw11_Exceptions.zad2;



public class Main {
    public static void main(String[] args) {

        wrapper(15);

    }

    public static void checkAge(int age) throws MyException{
        if (age > 21) {
            System.out.println("ok sir");
        } else {
                throw new MyException("no ok sir");

        }
    }

    public static void wrapper(int i) {
        try {
            checkAge(i);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

}
