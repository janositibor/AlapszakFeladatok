package k03_exceptionmulticatch.converter;

public class InvalidBinaryStringException extends RuntimeException{
    public InvalidBinaryStringException(String message, Throwable cause) {
        super(message,cause);
    }
}
