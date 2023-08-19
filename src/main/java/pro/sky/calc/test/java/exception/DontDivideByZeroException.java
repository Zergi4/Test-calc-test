package pro.sky.calc.test.java.exception;

public class DontDivideByZeroException extends IllegalArgumentException{
    public DontDivideByZeroException(String message) {
        super(message);
    }
}
