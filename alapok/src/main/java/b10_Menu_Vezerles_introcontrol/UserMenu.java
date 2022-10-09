package b10_Menu_Vezerles_introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int inputNumber=scanner.nextInt();
        switch(inputNumber) {
            case 1:
                System.out.println("Felhasználók listázása");
                break;
            case 2:
                System.out.println("Felhasználó felvétele");
                break;
            default:
                // Do nothing
        }

    }
}
