package f06_ScannerWithDelimiter_stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy összetett mondatot:");
        String osszetettMondat=scanner.nextLine();
        Scanner innerScanner = new Scanner(osszetettMondat).useDelimiter(", ");
        List<String> sentencesList = new ArrayList<>();
        while(innerScanner.hasNext()){
            sentencesList.add(innerScanner.next());
        }
        //System.out.println(sentencesList);
        for(String sentence:sentencesList){
            System.out.println(sentence);
        }
    }
}
