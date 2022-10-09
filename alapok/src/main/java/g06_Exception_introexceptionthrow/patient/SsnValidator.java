package g06_Exception_introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn){
        if(ssn.length()!=9) {
            return false;
        }
        else{
            try{
                Integer.parseInt(ssn);
            } catch (NumberFormatException e) {
                return false;
            }
            int oddSum=0;
            int evenSum=0;
            for(int i=0; i<ssn.length()-1;i++){
                if(i%2==0){
                    oddSum+=Character.getNumericValue(ssn.charAt(i));
                }
                else{
                    evenSum+=Character.getNumericValue(ssn.charAt(i));
                }
            }
            int ninethDigit=(3*oddSum+7*evenSum)%10;
            if(ninethDigit!=Character.getNumericValue(ssn.charAt(8))) {
                return false;
            }
            return true;
        }
    }
}
