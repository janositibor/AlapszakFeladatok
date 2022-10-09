package b07_registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return username.length()>0;
    }
    public boolean isValidPassword(String password1,String password2){
        return password1.equals(password2) && password1.length()>7;
    }
    public boolean isValidEmail(String email){
        int placeOfAt=email.indexOf("@");
        boolean isAt=placeOfAt>0;
        String domain=email.substring(placeOfAt+1);
        int placeOfDot=domain.indexOf(".");
        boolean isCharBetweenAtAndDot=placeOfDot>0;
        boolean dotNotTheLast=placeOfDot<domain.length()-1;
        //System.out.println(isAt+" + "+isCharBetweenAtAndDot+" + "+dotNotTheLast);
        return isAt && isCharBetweenAtAndDot && dotNotTheLast;
    }

}
