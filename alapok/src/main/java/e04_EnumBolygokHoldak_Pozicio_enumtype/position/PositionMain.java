package e04_EnumBolygokHoldak_Pozicio_enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        for(Position position:Position.values()){
            System.out.println(position.name()+"'s salary is "+position.getSalary()+" and the perks are: "+position.getBenefit());
        }
    }
}
