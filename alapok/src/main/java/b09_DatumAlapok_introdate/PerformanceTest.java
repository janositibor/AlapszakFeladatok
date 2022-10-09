package b09_DatumAlapok_introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance=new Performance(LocalDate.of(1993, 7, 27), "Depeche Mode", LocalTime.of(20,0), LocalTime.of(22, 50));
        /*
        System.out.println("The artist: "+performance.getArtist());
        System.out.println("The date of the concert: "+performance.getDate());
        System.out.println("The begin of the concert: "+performance.getStartTime());
        System.out.println("The end of the concert: "+performance.getEndTime());
         */
        System.out.println(performance.getArtist()+": "+performance.getDate()+" "+performance.getStartTime()+" - "+performance.getEndTime());
    }
}
