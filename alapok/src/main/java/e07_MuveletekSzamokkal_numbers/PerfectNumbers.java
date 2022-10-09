package e07_MuveletekSzamokkal_numbers;

public class PerfectNumbers {
    public int getSumOfDivisors(int number){
        if(number<1){
            return 0;
        }
        else{
            int SumOfDivisors=1;
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    SumOfDivisors+=i;
                }
            }
            return SumOfDivisors;
        }
    }
    public boolean isPerfectNumber(int number){
        if(getSumOfDivisors(number)==number){
            return true;
        }
        return false;
    }
}
