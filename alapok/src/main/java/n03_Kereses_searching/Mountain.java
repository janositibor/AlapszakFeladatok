package n03_Kereses_searching;

import java.util.Arrays;

public class Mountain {
    private int[] heightsArray;
    private Pike[] pikesArray;

    public Mountain(int[] heightsArray) {
        this.heightsArray = heightsArray;
        Arrays.sort(this.heightsArray);
    }

    public Mountain(Pike[] pikesArray) {
        this.pikesArray = pikesArray;
        Arrays.sort(this.pikesArray,new PikeComparator());
    }

    public boolean searchPike(Pike pike){
        int index=Arrays.binarySearch(heightsArray,pike.getHeight());
        return index>=0;
    }
    public int searchPikeByPike(Pike pike){
        int index=Arrays.binarySearch(pikesArray,pike,new PikeComparator());
        return index;
    }

}
