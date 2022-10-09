package g13_WriteFile_introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private final List<String> villagesList=new ArrayList<>(Arrays.asList("Pécs", "Kozármisleny", "Magyarsarlós","Lothárd","Birján","Belvárdgyula"));

    public void writeOut(){
        try {
            Files.write(Paths.get("roadmap.txt"), villagesList);
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RoadMap roadMap=new RoadMap();
        roadMap.writeOut();
    }
}
