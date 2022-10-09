package f05_GenerateRandomAlphanumericString_stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        String[] iceCreamTypes={"csoki","vanília","eper","citrom","puncs"};
        List<String> typeOfIceCreamList = Arrays.asList(iceCreamTypes);
        StringBuilder output=new StringBuilder("Ma kapható: ");
        for (int i = 0; i < typeOfIceCreamList.size(); i++) {
            output.append(typeOfIceCreamList.get(i));
            if (i != (typeOfIceCreamList.size() - 1)) {
                output.append(", ");
            }
        }
        output.append(". Gyerekeknek féláron!");
        System.out.println(output);
    }
}
