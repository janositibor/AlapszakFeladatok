package g06_Exception_introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        try{
            Adult adult1=new Adult("Tibó",45);
            System.out.println(adult1.getName()+" is "+adult1.getAge()+" year old");
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        try{
            Adult adult2=new Adult("Emma",8);
            System.out.println(adult2.getName()+" is "+adult2.getAge()+" year old");
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
