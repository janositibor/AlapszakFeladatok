package n03_Kereses_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {
    List<LostProperty> lostPropertiesOrderedList=new ArrayList<>();

    public void addProperty(LostProperty lostProperty){
        lostPropertiesOrderedList.add(lostProperty);
        Collections.sort(lostPropertiesOrderedList);
    }

    public LostProperty findLostProperty( LostProperty propertyToFind){
        int index=Collections.binarySearch(lostPropertiesOrderedList,propertyToFind);
        if(index<0){
            throw new IllegalArgumentException("Property not found.");
        }
        return lostPropertiesOrderedList.get(index);
    }

}
