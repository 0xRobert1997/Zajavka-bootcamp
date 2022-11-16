package Zajavka.days.day31_Exceptions;

public class MyException extends RuntimeException{
    // gdy klasa extenduje exception to staje się wyjątkiem i w kółku pokazuje się piorun

    public MyException() {
        super("My exception was thrown");
    }
}
