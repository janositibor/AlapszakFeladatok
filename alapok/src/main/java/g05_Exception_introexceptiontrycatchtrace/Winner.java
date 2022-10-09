package g05_Exception_introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> namesList = new ArrayList<>();

    public Winner() {
        String name1="Barna Béla";
        String name2="Fehér Virág";
        //String name3=new String();
        String name3=null;
        String name4="Kék Péter";
        namesList.add(name1);
        namesList.add(name2);
        namesList.add(name3);
        namesList.add(name4);
    }

    public String getWinner(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        return(namesList.get(randomNumber).toUpperCase());
    }
}
