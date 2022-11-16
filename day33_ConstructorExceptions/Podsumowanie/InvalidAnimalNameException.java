package Zajavka.days.day33_ConstructorExceptions.Podsumowanie;

public class InvalidAnimalNameException extends RuntimeException {
    public InvalidAnimalNameException(String message) {
        super(message);
    }
}
