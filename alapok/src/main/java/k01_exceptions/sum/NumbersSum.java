package k01_exceptions.sum;

public class NumbersSum {
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public int getSum(int[] numbers){
        exceptionhandler.set(numbers, new IllegalArgumentException("Parameter should not be null!"));
        exceptionhandler.isParameterNull();
        int total=0;
        for(int number:numbers){
            total+=number;
        }
    return total;
    }

    public int getSum(String[] numbers){
        exceptionhandler.set(numbers, new IllegalArgumentException("Parameter should not be null!"));
        exceptionhandler.isParameterNull();
        int total=0;
        for(String number:numbers){
            try {
                total += Integer.parseInt(number);
            }
            catch(Exception e){
                throw new IllegalArgumentException("Illegal numbers!",e);
            }
        }
        return total;
    }
}
