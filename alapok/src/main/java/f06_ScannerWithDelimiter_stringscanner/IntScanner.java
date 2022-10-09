package f06_ScannerWithDelimiter_stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints){
        Scanner innerScanner = new Scanner(ints).useDelimiter(";");
        List<Integer> integersList = new ArrayList<>();
        while(innerScanner.hasNextInt()){
            integersList.add(innerScanner.nextInt());
        }
        StringBuilder output=new StringBuilder();
        for (int i = 0; i < integersList.size(); i++) {
            if(integersList.get(i)>100) {
                output.append(integersList.get(i));
                if (i != (integersList.size() - 1)) {
                    output.append(", ");
                }
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy pontosvesszóvel elválasztott integer sorozatot:");
        String osszetettSzamok=scanner.nextLine();
        IntScanner intScanner=new IntScanner();
        System.out.println(intScanner.convertInts(osszetettSzamok));

    }

}
