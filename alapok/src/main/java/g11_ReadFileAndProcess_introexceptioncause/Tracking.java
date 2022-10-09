package g11_ReadFileAndProcess_introexceptioncause;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        trackPoints.readRows("src/main/java/introexceptioncause/tracking.csv");
        trackPoints.createZDifference();
        System.out.println(trackPoints.getzDifferenceInRows());
    }
}
