package c11_MathesRandom_math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        Random rnd = new Random(1984);
        String[] names = {"Monday Joe","Tuesday Jack","Wednesday David","Thursday Mary","Friday Ivan","Saturday Alex","Sunday Robert","White lilly","Black Jack","Never Enough"};
        List<String> namesList = Arrays.asList(names);
        System.out.println("The candidates are: "+namesList);
        int winnwer1 = rnd.nextInt(5);
        int winnwer2 = 5+rnd.nextInt(5);
        System.out.println("And the winners are: "+namesList.get(winnwer1)+" and "+namesList.get(winnwer2));
    }
}
