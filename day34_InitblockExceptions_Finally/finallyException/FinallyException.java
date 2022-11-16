package Zajavka.days.day34_InitblockExceptions_Finally.finallyException;

public class FinallyException {

    public static void main(String[] args) {
        try {
            print1();
        } catch (MyException1 e) {
            System.out.println("Catching myException1");
            throw new MyException2("Throwing myException2");

        } finally {
            System.out.println("calling finally");

                try {
                    throw new MyException1("finally myException1");
                } catch (MyException1 e) {
                    throw new RuntimeException(e);
                }
        }

    }

    private static void print1() throws MyException1 {
        System.out.println("print1");
        throw new MyException1("Throwing MyException1");

    }

    // nie trzeba w sygnaturze dawac throws bo MyException2 jest runtime
    private static void print2()  {
        System.out.println("print2");
        throw new MyException2("Throwing MyException2");

    }

}
