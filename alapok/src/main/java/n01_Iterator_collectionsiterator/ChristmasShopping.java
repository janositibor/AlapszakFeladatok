package n01_Iterator_collectionsiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presentsList=new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presentsList) {
        this.presentsList = presentsList;
    }

    public void addNewPresent(ChristmasPresent present){
        presentsList.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice){
        Iterator<ChristmasPresent> iterator = presentsList.iterator();
        int price=0;
        while (iterator.hasNext()) {
            price = iterator.next().getPrice();
            if (price>maxPrice) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(0,1, 2, 3, 4, 5));
        System.out.println(values);
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(values);

    }
}
