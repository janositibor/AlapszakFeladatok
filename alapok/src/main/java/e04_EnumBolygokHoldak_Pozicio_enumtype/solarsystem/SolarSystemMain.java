package e04_EnumBolygokHoldak_Pozicio_enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for(SolarSystem solarSystem:SolarSystem.values()){
            System.out.println(solarSystem.name()+" has "+solarSystem.getNumberOfMoons()+" moon(s)");
        }
    }
}
