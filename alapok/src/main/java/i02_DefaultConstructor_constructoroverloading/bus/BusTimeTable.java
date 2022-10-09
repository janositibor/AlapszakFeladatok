package i02_DefaultConstructor_constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable=new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute){
        for (int hours=firstHour;hours<=lastHour;hours++){
            timeTable.add(new SimpleTime(hours,everyMinute));
        }
    }

    public SimpleTime getNextBus(SimpleTime actual){
        for(int i=0; i<timeTable.size();i++){
            if(actual.getDifference(timeTable.get(i))<0){
                return timeTable.get(i);
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }
}
