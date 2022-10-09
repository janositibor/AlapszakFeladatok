package a003_KonzolKommunikacio_classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Type in the user's name:");
        note.setName(scanner.nextLine());

        System.out.println("Type in the topic of the note:");
        note.setTopic(scanner.nextLine());

        System.out.println("Type in the text for the note:");
        note.setText(scanner.nextLine());

        System.out.println("The content of the note is the following:");
        System.out.println(note.getNoteText());
    }
}
