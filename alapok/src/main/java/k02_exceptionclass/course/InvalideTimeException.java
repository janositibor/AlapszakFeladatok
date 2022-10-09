package k02_exceptionclass.course;

public class InvalideTimeException extends RuntimeException{
    public InvalideTimeException(String message) {
        super(message);
    }
}