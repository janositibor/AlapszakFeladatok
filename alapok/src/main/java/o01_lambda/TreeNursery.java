package o01_lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
    List<Sapling> saplingsList=new ArrayList<>();

    public TreeNursery(List<Sapling> saplingsList) {
        this.saplingsList = saplingsList;
    }

    void prune(int maxHeight){
        saplingsList.forEach(sapling -> sapling.cut(maxHeight));
    }
    void sell(String species, int minHeight){
        saplingsList.removeIf(sapling -> sapling.match(species, minHeight));
    }

    public List<Sapling> getSaplings() {
        return saplingsList;
    }
}
