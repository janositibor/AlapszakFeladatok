package h07_StringSzerkesztes_methodchain;

public class Grasshopper {
    private int position;

    public Grasshopper hopOnce(Direction direction){
        if(direction==Direction.NEGATIVE){
            position--;
        }
        else{
            position++;
        }
        return this;
    }

    void moveFromZeroToThreeWithFiveHops(){
        hopOnce(Direction.NEGATIVE)
        .hopOnce(Direction.POSITIVE)
        .hopOnce(Direction.POSITIVE)
        .hopOnce(Direction.POSITIVE)
        .hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
