package g05_Exception_introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner=new Winner();
        try {
            System.out.println("The winner is: "+winner.getWinner());
        }
        catch(NullPointerException npe){
            System.out.println("Null pointer hiba!");
            System.out.println(npe.getMessage());
        }
    }
}
