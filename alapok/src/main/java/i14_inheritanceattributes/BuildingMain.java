package i14_inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building=new Building("csúszózsalus", 67.5, 1);
        SchoolBuilding schoolBuilding=new SchoolBuilding("TVT", 1675, 3,32);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
