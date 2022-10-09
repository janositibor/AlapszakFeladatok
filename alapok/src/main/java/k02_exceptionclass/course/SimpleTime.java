package k02_exceptionclass.course;

public class SimpleTime {
    private int MIN_HOUR=0;
    private int MAX_HOUR=23;
    private int MIN_MINUTE=0;
    private int MAX_MINUTE=59;
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        validateHour(hour);
        validateMinute(minute);

        this.hour = hour;
        this.minute = minute;
    }




    public SimpleTime(String timeString) {
        if(timeString==null){
            throw new InvalideTimeException("Time is null");
        }
        if(!isValidTimeString(timeString)){
            throw new InvalideTimeException("Time is not hh:mm");
        }
        createTimefromString(timeString);
    }
    private void validateMinute(int minute) {
        if(minute<MIN_MINUTE || MAX_MINUTE<minute){
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
    }

    private void validateHour(int hour) {
        if(hour<MIN_HOUR || MAX_HOUR<hour){
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
    }
    private boolean isValidTimeString(String timeString) {
        String[] timeStringArray=timeString.split(":");
        if(timeStringArray.length!=2){
            return false;
        }
        if(timeStringArray[0].length()>2){
            return false;
        }
        if(timeStringArray[1].length()>2){
            return false;
        }
        return true;
    }

    private void createTimefromString(String timeString) {
        String[] timeStringArray=timeString.split(":");
        try{
            hour = Integer.parseInt(timeStringArray[0]);
            minute = Integer.parseInt(timeStringArray[1]);
        }
        catch(NumberFormatException nfe){
            throw new InvalideTimeException("Time is not hh:mm");
        }
        validateHour(hour);
        validateMinute(minute);

        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return  String.format("%02d", hour)+":"+String.format("%02d", minute);
    }
}
