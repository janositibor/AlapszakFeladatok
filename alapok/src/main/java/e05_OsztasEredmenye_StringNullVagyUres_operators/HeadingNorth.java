package e05_OsztasEredmenye_StringNullVagyUres_operators;

public class HeadingNorth {
    private int direction=0;
    private int lastDeviation=0;
    private int noOfSteps=0;

    public int getDirection() {
        return direction;
    }

    public int getNoOfSteps() {
        return noOfSteps;
    }

    public void newDeviation(){
        noOfSteps++;
        lastDeviation+=10;
        direction+=lastDeviation;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth=new HeadingNorth();
        System.out.println("After "+headingNorth.getNoOfSteps()+" steps the direction is: "+headingNorth.getDirection());
        while(headingNorth.getDirection()<360){
            headingNorth.newDeviation();
            System.out.println("After "+headingNorth.getNoOfSteps()+" steps the direction is: "+headingNorth.getDirection());
        }
    }
}
