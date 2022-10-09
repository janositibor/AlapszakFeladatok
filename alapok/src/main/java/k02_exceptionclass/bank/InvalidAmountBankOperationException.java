package k02_exceptionclass.bank;

public class InvalidAmountBankOperationException extends InvalidBankOperationException{
    public InvalidAmountBankOperationException(String message){
        super(message);
    }
}
