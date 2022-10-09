package g11_ReadFileAndProcess_introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    private List<String> coordinatesList;
    private List<Integer> zDifference = new ArrayList<>();

    public void readRows(String filename) {
        try {
            coordinatesList= Files.readAllLines(Paths.get(filename));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
    public void createZDifference(){
        for (int i=1; i< coordinatesList.size();i++){
            zDifference.add(Integer.parseInt(coordinatesList.get(i).split(";")[2])-Integer.parseInt(coordinatesList.get(i-1).split(";")[2]));
        }
    }

    public List<Integer> getzDifference() {
        return zDifference;
    }

    public String getzDifferenceInRows() {
        StringBuilder outputSB = new StringBuilder();

        for (int i = 0; i < zDifference.size(); i++) {
            outputSB.append(zDifference.get(i)+"\n");
        }
        return outputSB.toString();
    }
}
