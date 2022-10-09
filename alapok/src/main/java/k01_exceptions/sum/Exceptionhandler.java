package k01_exceptions.sum;

import java.util.List;

public class Exceptionhandler {
    private Object parameter;
    private Throwable exceptionToThrow;
    private String message;

    public void set(Object parameter,Throwable exceptionToThrow) {
        this.parameter = parameter;
        this.exceptionToThrow = exceptionToThrow;
        message= exceptionToThrow.getMessage();
    }
    public void setParameter(Object parameter) {
        this.parameter = parameter;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setExceptionToThrow(Throwable exceptionToThrow) {
        this.exceptionToThrow = exceptionToThrow;
        message= exceptionToThrow.getMessage();
    }

    public void error() {
        if (exceptionToThrow instanceof IllegalArgumentException) {
            throw new IllegalArgumentException(message);
        }
        else if(exceptionToThrow instanceof IllegalStateException) {
            throw new IllegalStateException(message);
        }
        else if(exceptionToThrow instanceof NullPointerException) {
            throw new NullPointerException(message);
        }
        else if(exceptionToThrow instanceof ArithmeticException) {
            throw new ArithmeticException(message);
        }
    }

    public void intBetweenLimits(int min, int max) {
        if((int)parameter<min || (int)parameter>max){
            error();
        }
    }

    public void isParameterNull() {
        if(parameter==null){
            error();
        }
    }
    public void isStringZeroLength() {
        if(parameter.equals("")){
            error();
        }
    }

    public void isStringEmpty() {
        isParameterNull();
        isStringZeroLength();
    }

    public void isListEmpty() {
        if(((List)parameter).size()==0){
            error();
        }
    }
}
