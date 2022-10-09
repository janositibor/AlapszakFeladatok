package b10_Menu_Vezerles_introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of people in the group:");
        int peopleNumberInTheGroup=scanner.nextInt();
        String usedBoats="";
        String freeBoats="";
        if(peopleNumberInTheGroup>10) {
            usedBoats="They will take the boats for 2,3 and 5 people.";
            freeBoats="No free capacity and "+(peopleNumberInTheGroup-10)+" people will stay at the coast.";
        }
        else if(peopleNumberInTheGroup>8) {
            usedBoats="They will take the boats for 2,3 and 5 people.";
            freeBoats="No free capacity.";
        }
        else if(peopleNumberInTheGroup>7) {
            usedBoats="They will take the boats for 3 and 5 people.";
            freeBoats="The boat for 2 people is free.";
        }
        else if(peopleNumberInTheGroup>5) {
            usedBoats="They will take the boats for 2 and 5 people.";
            freeBoats="The boat for 3 people is free.";
        }
        else if(peopleNumberInTheGroup>3) {
            usedBoats="They will take the boat for 5 people.";
            freeBoats="The boats for 2 and 3 people is free.";
        }
        else if(peopleNumberInTheGroup>2) {
            usedBoats="They will take the boat for 3 people.";
            freeBoats="The boats for 2 and 5 people is free.";
        }
        else if(peopleNumberInTheGroup>0) {
            usedBoats="They will take the boat for 2 people.";
            freeBoats="The boats for 3 and 5 people is free.";
        }
        else{
            usedBoats="Positive integer is expected ...";
        }
        System.out.println(usedBoats);
        System.out.println(freeBoats);
    }
}
