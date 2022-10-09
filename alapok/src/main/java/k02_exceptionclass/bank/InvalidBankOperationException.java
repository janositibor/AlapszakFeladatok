package k02_exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException{
    public InvalidBankOperationException(String message) {
        super(message);
    }
}
