package b03_Ido_Befektetes_statements;

import java.util.Scanner;

public class Time {
    String name;
    private int hour;
    private int minute;
    private int second;
    private Scanner scanner;

    public Time(String name) {
        this. scanner = new Scanner(System.in);
        this.name = name;
        this.setHour(this.RequestHour());
        this.setMinute(this.RequestMinute());
        this.setSecond(this.RequestSecond());
    }

    public String getName() {
        return name;
    }

    public int getInMinutes() {
        return 60*hour+minute;
    }
    public int getInSeconds() {
        return 60*this.getInMinutes()+second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        return this.name+": "+this.hour+":"+this.minute+":"+this.second;
    }
    public boolean earlierThan(Time timeToCompare){
        return this.getInSeconds() < timeToCompare.getInSeconds();
    }
    private int RequestHour(){
        int hour=-1;
        while(hour<0 || hour>23) {
            System.out.println("Type in the hour for \""+this.name+"\":");
            hour = this.scanner.nextInt();
        }
        scanner.nextLine(); // Dummy for the new line characters
        return hour;
    }
    private int RequestMinute(){
        int minute=-1;
        while(minute<0 || minute>60) {
            System.out.println("Type in the minute for \""+this.name+"\":");
            minute = this.scanner.nextInt();
        }
        scanner.nextLine(); // Dummy for the new line characters
        return minute;
    }
    private int RequestSecond(){
        int second=-1;
        while(second<0 || second>60) {
            System.out.println("Type in the second for \""+this.name+"\":");
            second = this.scanner.nextInt();
        }
        scanner.nextLine(); // Dummy for the new line characters
        return second;
    }
}
