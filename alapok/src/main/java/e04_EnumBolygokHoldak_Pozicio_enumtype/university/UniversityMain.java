package e04_EnumBolygokHoldak_Pozicio_enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        for(University university:University.values()){
            System.out.println(university.name()+" is an acronym for "+university.getName());
        }
    }
}
