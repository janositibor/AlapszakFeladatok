package i02_DefaultConstructor_constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time){
        this(time.getHours(),time.getMinutes());
    }
    private int getTimeInMinutes(){
        return 60*hours+minutes;
    }

    public int getDifference(SimpleTime time){
        return this.getTimeInMinutes()-time.getTimeInMinutes();
    }
    public String toString(){
        return String.format("%02d", hours)+":"+String.format("%02d", minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
