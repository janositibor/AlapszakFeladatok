package g06_Exception_introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("No name provided!");
        }
    }
    public void validateAge(String ageString){
        if(ageString.isEmpty()) {
            throw new IllegalArgumentException("No age provided!");
        }
        else{
            try{
                Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Please, provide an integer for your age!");
            }
            int age = Integer.parseInt(ageString);
            if(age<0 || 120<age) {
                throw new IllegalArgumentException("The age is out of valid range!");
            }
        }
    }
}
