package n02_Hasonlitasok_collectionscomp;

import java.util.Objects;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int numbersOfLevels;

    public Building(String address, int area, int numbersOfLevels) {
        this.address = address;
        this.area = area;
        this.numbersOfLevels = numbersOfLevels;
    }

    @Override
    public int compareTo(Building other) {
        return this.numbersOfLevels-other.numbersOfLevels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return numbersOfLevels == building.numbersOfLevels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbersOfLevels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", numbersOfLevels=" + numbersOfLevels +
                '}'+"\n";
    }

    public static void main(String[] args) {
        TreeSet<Building> buildingsOrderedSet=new TreeSet<Building>();
        Building building1=new Building("Muskátli u. 69", 200, 3);
        Building building2=new Building("Pámplirózsa u. 6", 100, 1);
        Building building3=new Building("Petőfi u. 3", 50, 2);
        Building building4=new Building("Havanna u. 3", 63, 10);

        buildingsOrderedSet.add(building4);
        buildingsOrderedSet.add(building1);
        buildingsOrderedSet.add(building3);
        buildingsOrderedSet.add(building2);

        System.out.println(buildingsOrderedSet);

    }
}
