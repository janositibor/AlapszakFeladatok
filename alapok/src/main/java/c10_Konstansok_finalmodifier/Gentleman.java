package c10_Konstansok_finalmodifier;

import java.util.Scanner;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";
    public String sayHello(String name){
        return MESSAGE_PREFIX+" "+name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gentleman gentleman=new Gentleman();

        System.out.println("Type in the name:");
        String name=scanner.nextLine();
        System.out.println(gentleman.sayHello(name));


    }
}
