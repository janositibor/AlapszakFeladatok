package j01_abstractclass.gamecharacter;

public class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point anotherPoint){
        return(Math.sqrt(Math.pow(x -anotherPoint.getX(),2)+Math.pow(y -anotherPoint.getY(),2)));
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
